(ns hello-world.core
  (:gen-class))

(defn hello-world 
    "Prints Hello, world! to the console. Returns nil"
	[]
    (println "Hello, world!"))

;;This is a lazy sequence that defines the fibonacci sequence
(def fib-seq (lazy-cat [0 1] 
	(map + fib-seq (rest fib-seq))))

(defn fib-limiter 
    "Prints all fibonacci numbers that are less than the supplied limit"
	[limit]
	(filter #(< % limit) fib-seq))

(defn prob-2 
    "Algorithm to find the answer to the first problem on projecteuler.net.
    Given a limit returns the sum of all even fibonacci numbers that are below.
    "
	[limit]
	(reduce + (filter #(and (even? %) (< % limit)) fib-seq)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ;; work around dangerous default behaviour in Clojure
  (alter-var-root #'*read-eval* (constantly false))
  (hello-world ))

(load "prob-1")