(ns clojurecafes.web
    (:gen-class)
    (:require [compojure.core :refer :all]
      [compojure.route :as route]
      [ring.adapter.jetty :refer [run-jetty]]
      [ring.middleware.params :refer [wrap-params]]
      [clojurecafes.maps :as maps])) ;; možemo kasnije koristiti maps funkcije

;; Minimalna home stranica
(defn home-page []
      "Hello World! Server radi.")

;; Sigurne rute
(defroutes app-routes
           (GET "/" [] (home-page))
           (route/not-found "Stranica nije pronađena"))

(def app-with-params (wrap-params app-routes))

(defn -main []
      (println "Pokrećem server...")
      (run-jetty app-with-params {:port 3000 :join? false}) ; join? false da ne blokira REPL
      (println "Server pokrenut na http://localhost:3000"))
