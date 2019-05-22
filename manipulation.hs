ret xs y = if (odd y) then (reverse xs) else xs


yeet xs = map (\x -> ret (x) (length x)) xs