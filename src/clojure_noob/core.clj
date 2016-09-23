(ns clojure-noob.core
	(require [clojure-noob.house :refer [fromhouse]])
	(:gen-class))

(defn argcount
	"This should be fucking called"
	[]
	(let [yayinput (read-line)]
		(if (= yayinput "1234")
			(fromhouse)
			(println "Wrong"))))

(defn -main 
	"This is the main fucking function"
	[& args]
	(println "Select input: ")
	(argcount))