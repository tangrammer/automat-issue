(println "issue core")
(ns issue.core
  (:gen-class))


(defn -main [& args]
  ;; We eval so that we don't AOT anything beyond this class
  (eval '(do
           (println "-main...")
           (require '[automat.core :as a])
           (require '[issue.hola :as h])
           (println "welcome -main! =>" [(a/or :a)] (h/hi) ))))
