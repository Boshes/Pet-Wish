(ns pet-wish.core
  (:gen-class))

(defn -main
  [& args]

  (def pets [
      {:pet "Dog" :names ["Fido" "Dabby" "Doggo" "Dapper" "Princess Tanxx"]}
      {:pet "Cat" :names ["B" "Stella" "Cat" "Rascal" "Ludwig"]}
      {:pet "Ferret" :names ["Ferry" "Toro" "Polon" "Fur" "Gerft"]}
      {:pet "Hamster" :names ["Lenny" "Hammy" "Dug Dug" "Merlin" "Hamtaro"]}
      {:pet "Turtle" :names ["Turt" "Tuck" "Fred" "Dave" "Adero"]}
      {:pet "Fish" :names ["Fishy" "George" "Angel" "Bur" "Derug"]}
      {:pet "Rabbit" :names ["Rabby" "Rascal" "Carrot" "Lettuce" "Leek"]}
      {:pet "Bird" :names ["Birdo" "Lala" "Hedwig" "Polly" "Jacques"]}
      {:pet "Lizard" :names ["Liz" "Mo" "Yulop" "Agnes" "Terry"]}
    ]
  )

  (defn choosePet
    [pet]
    (rand-nth pets)
  )

  (def pet
    (choosePet pets)
  )

  (println
    "You should get a"
    (get pet :pet)
    "and you should name it"
    (rand-nth (get pet :names))
  )
)
