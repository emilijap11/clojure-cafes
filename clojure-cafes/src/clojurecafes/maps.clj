(ns clojurecafes.maps)
(defn distance-km [lat1 lon1 lat2 lon2]
      (let [R 6371
            dLat (Math/toRadians (- lat2 lat1))
            dLon (Math/toRadians (- lon2 lon1))
            a (+ (Math/pow (Math/sin (/ dLat 2)) 2)
                 (* (Math/cos (Math/toRadians lat1))
                    (Math/cos (Math/toRadians lat2))
                    (Math/pow (Math/sin (/ dLon 2)) 2)))]
           (* R 2 (Math/atan2 (Math/sqrt a) (Math/sqrt (- 1 a))))))





