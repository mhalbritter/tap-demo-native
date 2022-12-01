```
export NAMESPACE=... # YOUR namespace goes here
tanzu apps workload create tap-demo-native -n $NAMESPACE -f config/workload.yaml
tanzu apps workload tail tap-demo-native -n $NAMESPACE
```
