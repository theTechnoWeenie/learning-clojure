(def nat-nums (rest (range)))

(defn prob-1 [limit]
	(reduce + (filter 
			#(or (zero? (mod % 3)) (zero? (mod % 5)))
			 (take (- limit 1) nat-nums))))
