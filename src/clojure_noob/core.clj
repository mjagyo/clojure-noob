(ns clojure-noob.core
	(require [clojure-noob.house :refer [fromhouse]])
	(:gen-class))

(defn argcount []
	(let [yayinput (read-line)]
		(if (= yayinput "1234")
			(fromhouse)
			(println "Wrong"))))

(defn -main [& args]
	(println "Select input: ")
	(argcount))