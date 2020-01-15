# Mars Rover  

## Todo List

* Move forward command should result in one step in current direction **for start location (5,5)***
```
init(5,5,N) + M => (5,6,N)
init(5,5,S) + M => (5,4,S)
init(5,5,E) + M => (6,5,E)
init(5,5,W) + M => (4,5,W)
```
  
* (Assumption, needs clarification with business side) Move forward command in edge location results in no change to location and direction
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

* Move forward command should result in one step in current direction **for arbitrary start location**
```
init(1,1,N) + M => (1,2,N)
init(3,7,S) + M => (2,7,S)
```

* Chain of move forward command and turn right command results in change of location and direction
```
init(5,5,N) + ML => (5,6,W)
```

* Chain of multiple commands results in change of location and direction
```
init(5,5,N) + MLRMMRM => (6,8,E)
```