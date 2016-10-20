FROM node:0.12
MAINTAINER tribou

# Prepare app directory
RUN mkdir -p /usr/src/app
ADD resources/public /usr/src/app

# Install dependencies
WORKDIR /usr/src/app

# Build the app
RUN npm install -g http-server

# Expose the app port
EXPOSE 8080

# Start the app
CMD hs
