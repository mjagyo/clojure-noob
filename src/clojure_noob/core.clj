(ns clojure-noob.core
	(:require [clojure.string :as str])
	(:gen-class))

(def animals-encountered 
	{
		:bear {
			:type "strong"
			:fight_chance "70"
			:search_chance "20"
		}
		:dear {
			:type "weak"
			:fight_chance "20"
			:search_chance "60"
		}
		:rat {
			:type "weak"
			:fight_chance "10"
			:search_chance "60"
		}
	})

(defn go
	"Go to specific place"
	[adv tmap]
	(println "function go")
	(if (= (get-in adv [:location] :forest))
		(println "ddd")
		)
	; (println adv)
	; (println tmap)
	)

(def the-map
	{
		:house {
			:desc "You will die eventually because you stayed in the house. (sad face)"
			:title "the house"
			:content #{"knife" "bed"}
		}
		:forest {
			:desc "You really want adventure huh? Now were searching..."
			:title "the forest"
			:content #{"knife" "gun" "flame thrower"}
		}
		:searching {
			:desc "Searching for something to eat."
			:title "searching for something"
			:content #{}
		}
	})

(def adventurer 
	{
		:location :house
		:name ""
	})

(defn -main [& args]
	(println "Welcome! Glad you came to this very exciting adventure game.")
	(println "Heres the scenario.")
	(println "
		You are in the house. Youre in the dark scary night.
		You have no food, you have not taken a bath for a month.
		There is only forest outside of your house.
		What do you do ? 
		")
	(println "Please select an event below.")
	(println "[forest] Go to forest.")
	(println "[house] Stay in the house.")
	(let [n (str (read-line))
		adv' (assoc-in adventurer [:location] (keyword n))]
		(let  [curr_location (adv' :location)]
			(go adv' (get-in the-map [curr_location])))))