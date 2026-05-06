# Assignment 4: Graph Traversal and Representation System

## Project Overview

This project implements a graph traversal system in Java.  
The graph is represented using an adjacency list.  
A graph consists of vertices and edges. Vertices are nodes, and edges are connections between nodes.

The project includes two main traversal algorithms:

- Breadth-First Search (BFS)
- Depth-First Search (DFS)

## Class Descriptions

### Vertex

The Vertex class represents a node in the graph.  
Each vertex has a unique id.

### Edge

The Edge class represents a connection between two vertices.  
It contains a source vertex and a destination vertex.

### Graph

The Graph class stores the graph using an adjacency list.  
An adjacency list shows which vertices are connected to each vertex.

Main methods:

- addVertex()
- addEdge()
- printGraph()
- bfs()
- dfs()

### Experiment

The Experiment class runs BFS and DFS on graphs of different sizes.  
It also measures execution time using System.nanoTime().

## Algorithm Descriptions

## Breadth-First Search BFS

BFS visits vertices level by level.  
It starts from one vertex and first visits all its direct neighbors.  
Then it visits the neighbors of those neighbors.

BFS uses a queue.

Steps:

1. Start from the selected vertex.
2. Add it to the queue.
3. Mark it as visited.
4. Remove one vertex from the queue.
5. Visit all unvisited neighbors.
6. Repeat until the queue is empty.

Time complexity:

O(V + E)

V means vertices.  
E means edges.

Use cases:

BFS is useful when we need to find the shortest path in an unweighted graph.

## Depth-First Search DFS

DFS goes as deep as possible before going back.  
It starts from one vertex and continues visiting one branch until the end.

DFS can use recursion or a stack.

Steps:

1. Start from the selected vertex.
2. Mark it as visited.
3. Visit one unvisited neighbor.
4. Continue deeper.
5. Go back when there are no more unvisited neighbors.

Time complexity:

O(V + E)

Use cases:

DFS is useful for exploring all paths, detecting cycles, and checking connected components.

## Experimental Results

| Graph Size | BFS Time | DFS Time |
|----------|----------|----------|
Graph size: 30 vertices
BFS traversal: 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 
DFS traversal: 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 
BFS time: 1029100 ns
DFS time: 394700 ns

Graph size: 100 vertices
BFS traversal: 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 
DFS traversal: 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 
BFS time: 2932500 ns
DFS time: 1252000 ns
Experiment completed.

## Observations

When the graph size increases, the execution time also increases.  
This happens because BFS and DFS need to visit vertices and edges.

The results match the expected complexity O(V + E), because both algorithms process vertices and edges.

In my experiment, BFS and DFS had close performance.  
Sometimes BFS was faster, and sometimes DFS was faster because execution time can depend on graph structure and system performance.

## How Graph Structure Affects Traversal Order

Graph structure affects the order of traversal.  
If a vertex has many neighbors, BFS visits them level by level.  
DFS may go deep into one path first before returning to other vertices.

## When BFS is Preferred Over DFS

BFS is preferred when we need the shortest path in an unweighted graph.  
It is also useful when we need to search level by level.

## Limitations of DFS

DFS can go too deep in large graphs.  
If recursion is used, it may cause stack overflow.  
DFS also does not always find the shortest path.

## Screenshots

<img width="1884" height="922" alt="image" src="https://github.com/user-attachments/assets/dfb57eb7-9867-4a23-a56f-3a341499e9ef" />
<img width="1857" height="982" alt="2026-05-06_15-47-31" src="https://github.com/user-attachments/assets/2be9b762-f008-4e84-957d-a0ac16cb006a" />
<img width="1875" height="973" alt="2026-05-06_15-47-53" src="https://github.com/user-attachments/assets/f86b2056-031e-42ec-ab80-f06df4b1c903" />
<img width="1872" height="979" alt="2026-05-06_15-48-27" src="https://github.com/user-attachments/assets/f6d057eb-7982-4a64-ab67-01ba298015fb" />
<img width="1920" height="1080" alt="2026-05-06_15-48-47" src="https://github.com/user-attachments/assets/aa58ddbf-c6a0-4d52-af9b-345da826285d" />


 
- Graph structure output
- BFS traversal output
- DFS traversal output
- Performance results

## Reflection

In this assignment, I learned how graphs can be represented using an adjacency list.  
I also learned how BFS and DFS work differently when traversing a graph.

BFS uses a queue and visits vertices level by level.  
DFS uses recursion or a stack and goes deep into one path first.  
The main challenge was understanding how visited vertices prevent the algorithm from repeating the same nodes.
