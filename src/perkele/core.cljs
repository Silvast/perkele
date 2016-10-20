(ns perkele.core
  (:require [reagent.core :as reagent :refer [atom]]
            [reagent.session :as session]
            [secretary.core :as secretary :include-macros true]
            [accountant.core :as accountant]
            [perkele.header :refer [navbar]]
            [cljsjs.bootstrap]
            [goog.events :as events]
            [goog.history.EventType :as EventType])
  (:import goog.history.Html5History
           goog.Uri))


(enable-console-print!)

(println "This text is printed from src/perkele/core.cljs. Go ahead and edit it and see reloading in action.")

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:text "Hello world!"}))

(defn hello-world []
  [:h1 (:text @app-state)])

(defn hello []
  [:h1 "jee"])


(defn home-page []
  [:div.container
   [navbar]
   [:h1 "Jumalauta nyt!"
    [:div [hello]]]])

(defn about-page []
  [:div [:h2 "About routing"]
   [:div [:a {:href "/"} "go to the home page"]]])

(defn current-page []
  [:div [(session/get :current-page)]])

;; Routing
;;(secretary/defroute "/" []
                    ;;(session/put! :current-page home-page))

;;(secretary/defroute "/about" []
                   ;; (session/put! :current-page about-page))

(reagent/render-component [home-page]
                        (. js/document (getElementById "app")))


;; -------------------------
;; Initialize app
;;(defn init! []
  ;;(reagent/render-component [home-page] (.getElementById js/document "app")))