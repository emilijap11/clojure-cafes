(ns clojurecafes.routes
    (:require [compojure.core :refer :all]
      [compojure.route :as route]
      [clojurecafes.core :as core]
      [clojurecafes.web :as web]
      [ring.util.response :refer [file-response]]))


(defroutes app-routes
           (GET "/" []
                (file-response "resources/public/index.html"))


           (POST "/search" {params :params}
                 (let [user {:lat 44.8170
                             :lng 20.4600
                             :location (params "location")
                             :max-distance (js/parseFloat (params "distance"))}
                       filtered-cafes (core/filter-cafes user)]
                      (response (web/results-page filtered-cafes))))




           (POST "/test" []
                 (response "POST radi"))

           (route/resources "/")
           (route/not-found "404"))
