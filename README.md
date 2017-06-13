# automat-issue
ztellman/automat generates Caused by: java.lang.ClassCastException: clojure.lang.Var$Unbound cannot be cast to clojure.lang.MultiFn

## adding clojurescript dependency and `:aot :all`

```clojure
(defproject issue "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :exclusions [org.clojure/clojure  #_org.clojure/clojurescript]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [automat "0.2.2"]
                 [org.clojure/clojurescript "1.9.562"]]
  :main issue.core
  :aot :all)
```

```
$ lein clean && lein uberjar
Compiling issue.core
issue core
Compiling issue.hola
hola...
Created /Users/tangrammer/git/ride-on/issue/target/issue-0.1.0-SNAPSHOT.jar
Created /Users/tangrammer/git/ride-on/issue/target/issue-0.1.0-SNAPSHOT-standalone.jar
tangrammers-MacBook-Pro:issue tangrammer$ java -jar ./target/issue-0.1.0-SNAPSHOT-standalone.jar 
issue core
-main...
Exception in thread "main" java.lang.ExceptionInInitializerError
	at java.lang.Class.forName0(Native Method)
	at java.lang.Class.forName(Class.java:344)
	at clojure.lang.RT.classForName(RT.java:2168)
	at clojure.lang.RT.classForName(RT.java:2177)
	at clojure.lang.RT.loadClassForName(RT.java:2196)
	at clojure.lang.RT.load(RT.java:443)
	at clojure.lang.RT.load(RT.java:419)
	at clojure.core$load$fn__5677.invoke(core.clj:5893)
	at clojure.core$load.invokeStatic(core.clj:5892)
	at clojure.core$load.doInvoke(core.clj:5876)
	at clojure.lang.RestFn.invoke(RestFn.java:408)
	at clojure.core$load_one.invokeStatic(core.clj:5697)
	at clojure.core$load_one.invoke(core.clj:5692)
	at clojure.core$load_lib$fn__5626.invoke(core.clj:5737)
	at clojure.core$load_lib.invokeStatic(core.clj:5736)
	at clojure.core$load_lib.doInvoke(core.clj:5717)
	at clojure.lang.RestFn.applyTo(RestFn.java:142)
	at clojure.core$apply.invokeStatic(core.clj:648)
	at clojure.core$load_libs.invokeStatic(core.clj:5774)
	at clojure.core$load_libs.doInvoke(core.clj:5758)
	at clojure.lang.RestFn.applyTo(RestFn.java:137)
	at clojure.core$apply.invokeStatic(core.clj:648)
	at clojure.core$require.invokeStatic(core.clj:5796)
	at clojure.core$require.doInvoke(core.clj:5796)
	at clojure.lang.RestFn.invoke(RestFn.java:421)
	at automat.compiler.core$loading__5569__auto____4205.invoke(core.cljc:1)
	at automat.compiler.core__init.load(Unknown Source)
	at automat.compiler.core__init.<clinit>(Unknown Source)
	at java.lang.Class.forName0(Native Method)
	at java.lang.Class.forName(Class.java:344)
	at clojure.lang.RT.classForName(RT.java:2168)
	at clojure.lang.RT.classForName(RT.java:2177)
	at clojure.lang.RT.loadClassForName(RT.java:2196)
	at clojure.lang.RT.load(RT.java:443)
	at clojure.lang.RT.load(RT.java:419)
	at clojure.core$load$fn__5677.invoke(core.clj:5893)
	at clojure.core$load.invokeStatic(core.clj:5892)
	at clojure.core$load.doInvoke(core.clj:5876)
	at clojure.lang.RestFn.invoke(RestFn.java:408)
	at clojure.core$load_one.invokeStatic(core.clj:5697)
	at clojure.core$load_one.invoke(core.clj:5692)
	at clojure.core$load_lib$fn__5626.invoke(core.clj:5737)
	at clojure.core$load_lib.invokeStatic(core.clj:5736)
	at clojure.core$load_lib.doInvoke(core.clj:5717)
	at clojure.lang.RestFn.applyTo(RestFn.java:142)
	at clojure.core$apply.invokeStatic(core.clj:648)
	at clojure.core$load_libs.invokeStatic(core.clj:5774)
	at clojure.core$load_libs.doInvoke(core.clj:5758)
	at clojure.lang.RestFn.applyTo(RestFn.java:137)
	at clojure.core$apply.invokeStatic(core.clj:648)
	at clojure.core$require.invokeStatic(core.clj:5796)
	at clojure.core$require.doInvoke(core.clj:5796)
	at clojure.lang.RestFn.invoke(RestFn.java:436)
	at automat.compiler.base$loading__5569__auto____4203.invoke(base.cljc:1)
	at automat.compiler.base__init.load(Unknown Source)
	at automat.compiler.base__init.<clinit>(Unknown Source)
	at java.lang.Class.forName0(Native Method)
	at java.lang.Class.forName(Class.java:344)
	at clojure.lang.RT.classForName(RT.java:2168)
	at clojure.lang.RT.classForName(RT.java:2177)
	at clojure.lang.RT.loadClassForName(RT.java:2196)
	at clojure.lang.RT.load(RT.java:443)
	at clojure.lang.RT.load(RT.java:419)
	at clojure.core$load$fn__5677.invoke(core.clj:5893)
	at clojure.core$load.invokeStatic(core.clj:5892)
	at clojure.core$load.doInvoke(core.clj:5876)
	at clojure.lang.RestFn.invoke(RestFn.java:408)
	at clojure.core$load_one.invokeStatic(core.clj:5697)
	at clojure.core$load_one.invoke(core.clj:5692)
	at clojure.core$load_lib$fn__5626.invoke(core.clj:5737)
	at clojure.core$load_lib.invokeStatic(core.clj:5736)
	at clojure.core$load_lib.doInvoke(core.clj:5717)
	at clojure.lang.RestFn.applyTo(RestFn.java:142)
	at clojure.core$apply.invokeStatic(core.clj:648)
	at clojure.core$load_libs.invokeStatic(core.clj:5774)
	at clojure.core$load_libs.doInvoke(core.clj:5758)
	at clojure.lang.RestFn.applyTo(RestFn.java:137)
	at clojure.core$apply.invokeStatic(core.clj:648)
	at clojure.core$require.invokeStatic(core.clj:5796)
	at clojure.core$require.doInvoke(core.clj:5796)
	at clojure.lang.RestFn.invoke(RestFn.java:619)
	at automat.core$loading__5569__auto____4201.invoke(core.cljc:1)
	at automat.core__init.load(Unknown Source)
	at automat.core__init.<clinit>(Unknown Source)
	at java.lang.Class.forName0(Native Method)
	at java.lang.Class.forName(Class.java:344)
	at clojure.lang.RT.classForName(RT.java:2168)
	at clojure.lang.RT.classForName(RT.java:2177)
	at clojure.lang.RT.loadClassForName(RT.java:2196)
	at clojure.lang.RT.load(RT.java:443)
	at clojure.lang.RT.load(RT.java:419)
	at clojure.core$load$fn__5677.invoke(core.clj:5893)
	at clojure.core$load.invokeStatic(core.clj:5892)
	at clojure.core$load.doInvoke(core.clj:5876)
	at clojure.lang.RestFn.invoke(RestFn.java:408)
	at clojure.core$load_one.invokeStatic(core.clj:5697)
	at clojure.core$load_one.invoke(core.clj:5692)
	at clojure.core$load_lib$fn__5626.invoke(core.clj:5737)
	at clojure.core$load_lib.invokeStatic(core.clj:5736)
	at clojure.core$load_lib.doInvoke(core.clj:5717)
	at clojure.lang.RestFn.applyTo(RestFn.java:142)
	at clojure.core$apply.invokeStatic(core.clj:648)
	at clojure.core$load_libs.invokeStatic(core.clj:5774)
	at clojure.core$load_libs.doInvoke(core.clj:5758)
	at clojure.lang.RestFn.applyTo(RestFn.java:137)
	at clojure.core$apply.invokeStatic(core.clj:648)
	at clojure.core$require.invokeStatic(core.clj:5796)
	at clojure.core$require.doInvoke(core.clj:5796)
	at clojure.lang.RestFn.invoke(RestFn.java:408)
	at clojure.core$eval3.invokeStatic(NO_SOURCE_FILE:10)
	at clojure.core$eval3.invoke(NO_SOURCE_FILE:10)
	at clojure.lang.Compiler.eval(Compiler.java:6927)
	at clojure.lang.Compiler.eval(Compiler.java:6916)
	at clojure.lang.Compiler.eval(Compiler.java:6890)
	at clojure.core$eval.invokeStatic(core.clj:3105)
	at clojure.core$eval.invoke(core.clj:3101)
	at issue.core$_main.invokeStatic(core.clj:8)
	at issue.core$_main.doInvoke(core.clj:6)
	at clojure.lang.RestFn.invoke(RestFn.java:397)
	at clojure.lang.AFn.applyToHelper(AFn.java:152)
	at clojure.lang.RestFn.applyTo(RestFn.java:132)
	at issue.core.main(Unknown Source)
Caused by: java.lang.ClassCastException: clojure.lang.Var$Unbound cannot be cast to clojure.lang.MultiFn
	at automat.fsm__init.load(Unknown Source)
	at automat.fsm__init.<clinit>(Unknown Source)
	... 122 more

```
