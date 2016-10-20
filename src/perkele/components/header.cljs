(ns perkele.header
  (:require [reagent.core :as reagent :refer [atom]]
            [reagent.session :as session]
            [secretary.core :as secretary :include-macros true]
            [accountant.core :as accountant]))

(defn navbar []
  [:nav.navbar.navbar-default.navbar-static-top
   [:div.container
     [:div.collapse.navbar-collapse
      [:ul.nav.navbar-nav
       [:li.nav-item.active
        [:a.nav-link {:href "#"} "hih"]]
       [:li.nav-item  [:a.nav-link {:href "#"} "hoh"]]]]]])
