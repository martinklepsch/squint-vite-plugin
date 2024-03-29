;; FIXME updating this file results in a full page refresh instead of HMR
(require '["react" :as react :refer [useState]])

(def $ react/createElement)

(defn MyComponent
  []
  ($ :div
     {}
     (let [[state setState] (useState 0)]
       ($ :div {} "You clicked " state "times"
          ($ :button {:onClick (fn [[_ _ _]]
                                 (setState (inc state)))}
             "Click me!")
          ($ :ul {} (interpose " " ["Hello" "world!"]))))))

;; JSX does not currently work --

;; import * as squint_core from "/node_modules/.vite/deps/squint-cljs_core__js.js?v=f0848ac3";
;; import * as cmp from "/component.cljs?import";
;; import __vite__cjsImport2_reactDom_client from "/node_modules/.vite/deps/react-dom_client.js?v=6f3844a1"; const rdom = ((m) => m?.__esModule ? m : { ...(typeof m === 'object' && !Array.isArray(m) || typeof m === 'function' ? m : {}), default: m })(__vite__cjsImport2_reactDom_client);
;; var root = rdom.createRoot(document.getElementById("app"));
;; var main = function() {
;;   FIXME The `React` alias is not defined in this module
;;   root.render(/* @__PURE__ */ React.createElement(cmp.MyComponent, null));
;;   let h11 = document.createElement("h1");
;;   h11.textContent = "xxx";
;;   document.body.appendChild(h11);
;;   return console.log("fooba");
;; };
;; export { root, main };

