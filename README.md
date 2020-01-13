# Mars Rover  

## Todo List

* Move forward command should result in one step in current direction
```
init(5,5,N) + M => (5,6,N)
init(5,5,S) + M => (5,4,N)
init(5,5,E) + M => (6,5,N)
init(5,5,W) + M => (4,5,N)
```
  
* Move forward command in edge location results in no change to location and direction
```
init(5,n-1,N) + M => (n-1,n-1,N)
init(n-1,5,E) + M => (n-1,n-1,E)
init(5,1,S)   + M => (0,0,S)
init(1,5,W)   + M => (0,0,W)
```

* Turn right command results in turning 90 degrees clockwise
```
init(5,5,N) + R => (5,5,E)
init(5,5,E) + R => (5,5,S)
init(5,5,S) + R => (5,5,W)
init(5,5,W) + R => (5,5,N)
```

* Turn left command results in turning 90 degrees anti-clockwise
```
init(5,5,N) + L => (5,5,W)
init(5,5,E) + L => (5,5,N)
init(5,5,S) + L => (5,5,E)
init(5,5,W) + L => (5,5,S)
```

* Chain of move forward command and turn right command results in change of location and direction
```
init(5,5,N) + ML => (5,6,W)
```

* Chain of multiple commands results in change of location and direction
```
init(5,5,N) + MLRMMRM => (4,8,E)
```