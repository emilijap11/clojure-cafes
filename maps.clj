(ns clojurecafes.maps)

(defn distance-km [lat1 lon1 lat2 lon2]
  (let [earth-radius-km 6371
        d-lat (Math/toRadians (- lat2 lat1))
        d-lon (Math/toRadians (- lon2 lon1))
        a (+ (Math/pow (Math/sin (/ d-lat 2)) 2)
             (* (Math/cos (Math/toRadians lat1))
                (Math/cos (Math/toRadians lat2))
                (Math/pow (Math/sin (/ d-lon 2)) 2)))]
    (* earth-radius-km 2 (Math/atan2 (Math/sqrt a) (Math/sqrt (- 1 a))))))
