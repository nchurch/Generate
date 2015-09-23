(ns generate.core)

(defn generate
  [f & more]
  (letfn [(recurse
            [coll args]
            (let [next-val (apply f args)]
              (lazy-cat coll (recurse [next-val] (conj (butlast args) next-val)))))]
    (recurse more (reverse more))))
