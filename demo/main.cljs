(require '["./component.cljs" :as cmp]
         '["react-dom/client" :as rdom]
         '["react" :as react])

(def $ react/createElement)

(def root (rdom/createRoot (js/document.getElementById "app")))

(defonce
  render
  (do
   (js/console.log "render called")
   (.render root ($ cmp/MyComponent))))

(defn main []
  (js/console.log "Main called" (js/Date.))
  (let [h1 (js/document.createElement "h1")]
    (set! (.-textContent h1) "xxx")
    (js/document.body.appendChild h1))
  )
