```
export NAMESPACE=... # YOUR namespace goes here
tanzu apps workload create tap-demo-native -n $NAMESPACE -f config/workload.yaml
tanzu apps workload tail tap-demo-native -n $NAMESPACE
tanzu apps workload get tap-demo-native -n $NAMESPACE
```

# Change

```
tanzu apps workload apply tap-demo-native -n $NAMESPACE -f config/workload.yaml
```

# Remove

```
tanzu apps workload delete tap-demo-native -n $NAMESPACE
```
