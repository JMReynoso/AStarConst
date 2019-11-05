import java.util.*;

public class Assignmnet1 {

	public static void main(String args[]){
		
		System.out.println("Enter C value (must be int): ");
		Scanner scan = new Scanner(System.in);
		int cVal = scan.nextInt();
		
		if(cVal > 0) {
			System.out.println("Enter enviornment 1 or 2(new enviornment): ");
			int eVal = scan.nextInt();
			
			if(eVal == 1) {
				graph aStar = new graph(34);
				setUpGraph(aStar);
				aStar.aStar(34, cVal);
			}
			
			else if(eVal == 2) {
				graph aStar = new graph(20);
				setUpGraphNew(aStar);
				aStar.aStar(20, cVal);
			}
			
			else System.out.println("Enviornment does not exist.");
		}
		
		else System.out.println("C value cannot be negative.");
		
		System.out.println("Exiting program.");

		
	}
	
	static void setUpGraphNew(graph aStar) {
		aStar.addEdge(0, 1, 6);
		aStar.addEdge(0, 5, 18);
		aStar.addEdge(0, 9, 17);
		
		aStar.addEdge(1, 4, 16);
		aStar.addEdge(1, 2, 17);
		aStar.addEdge(2, 3, 17);
		aStar.addEdge(3, 4, 17);
		aStar.addEdge(4, 6, 10);
		
		aStar.addEdge(9, 10, 7);
		aStar.addEdge(9, 12, 17);
		aStar.addEdge(12, 11, 8);
		aStar.addEdge(10, 11, 17);
		aStar.addEdge(10, 8, 19);
		aStar.addEdge(11, 13, 10);
		aStar.addEdge(12, 13, 14);
		
		aStar.addEdge(5, 8, 28);
		aStar.addEdge(8, 7, 11);
		aStar.addEdge(5, 6, 11);
		aStar.addEdge(6, 7, 28);
		aStar.addEdge(7, 18, 6);
		aStar.addEdge(6, 17, 10);
		
		aStar.addEdge(17, 18, 37);
		aStar.addEdge(17, 19, 19);
		aStar.addEdge(18, 19, 19);
		
		aStar.addEdge(20, 19, 18);
		aStar.addEdge(20, 18, 17);
		aStar.addEdge(20, 16, 15);
		
		aStar.addEdge(16, 15, 13);
		aStar.addEdge(15, 14, 38);
		aStar.addEdge(14, 13, 13);
		
		
	}
	
	static void setUpGraph(graph aStar) {
		//0 = root
		aStar.addEdge(0, 1, 8);
		aStar.addEdge(0, 4, 7);
		
		aStar.addEdge(1, 5, 11);
		aStar.addEdge(1, 9, 15);
		aStar.addEdge(1, 10, 23);
		aStar.addEdge(1, 5, 43);
		aStar.addEdge(1, 4, 14);
		aStar.addEdge(1, 2, 43);
		
		aStar.addEdge(2, 10, 22);
		aStar.addEdge(2, 12, 11);
		aStar.addEdge(2, 19, 10);
		aStar.addEdge(2, 13, 22);
		aStar.addEdge(2, 17, 13);
		aStar.addEdge(2, 3, 14);
		
		aStar.addEdge(3, 19, 9);
		aStar.addEdge(3, 4, 43);
		
		aStar.addEdge(4, 3, 43);
		
		aStar.addEdge(5, 6, 14);
		aStar.addEdge(5, 9, 15);
		
		aStar.addEdge(6, 7, 21);
		
		aStar.addEdge(7, 8, 17);
		aStar.addEdge(7, 11, 19);
		aStar.addEdge(7, 14, 21);
		
		aStar.addEdge(8, 11, 7);
		aStar.addEdge(8, 10, 19);
		aStar.addEdge(8, 9, 20);
		
		aStar.addEdge(9, 10, 9);
		
		aStar.addEdge(10, 12, 12);
		aStar.addEdge(10, 11, 22);
		
		aStar.addEdge(11, 14, 12);
		aStar.addEdge(11, 13, 10);
		aStar.addEdge(11, 12, 22);
		
		aStar.addEdge(12, 13, 14);
		
		aStar.addEdge(13, 17, 13);
		aStar.addEdge(13, 16, 21);
		aStar.addEdge(13, 14, 17);
		
		aStar.addEdge(14, 15, 11);

		aStar.addEdge(15, 23, 10);
		aStar.addEdge(15, 16, 11);
		
		aStar.addEdge(16, 23, 7);
		aStar.addEdge(16, 20, 22);
		aStar.addEdge(16, 17, 19);
		
		aStar.addEdge(17, 20, 11);
		aStar.addEdge(17, 18, 18);
		aStar.addEdge(17, 19, 20);
		
		aStar.addEdge(18, 20, 8);
		aStar.addEdge(18, 21, 16);
		aStar.addEdge(18, 24, 18);
		aStar.addEdge(18, 29, 7);
		aStar.addEdge(18, 19, 13);
		
		aStar.addEdge(19, 29, 18);
		aStar.addEdge(19, 28, 16);
		aStar.addEdge(19, 27, 25);
		
		aStar.addEdge(20, 21, 18);
		aStar.addEdge(20, 23, 28);
		
		aStar.addEdge(21, 22, 28);
		
		aStar.addEdge(22, 33, 4);
		aStar.addEdge(22, 32, 9);
		aStar.addEdge(22, 23, 18);
		
		aStar.addEdge(24, 30, 9);
		aStar.addEdge(24, 25, 10);
		aStar.addEdge(24, 29, 12);
		
		aStar.addEdge(25, 26, 11);
		
		aStar.addEdge(26, 27, 10);
		
		aStar.addEdge(25, 26, 11);
		
		aStar.addEdge(27, 28, 10);
		
		aStar.addEdge(28, 29, 11);
		
		aStar.addEdge(29, 24, 10);
		
		aStar.addEdge(30, 31, 26);
		aStar.addEdge(30, 33, 29);
		
		//34 = goal
		aStar.addEdge(31, 34, 5);
		aStar.addEdge(31, 32, 7);
		
		aStar.addEdge(32, 34, 7);
		aStar.addEdge(32, 33, 7);
	}
	
	
}

class edge{
	int firstNode;
	int nextNode;
	int distance;
	
	public edge(int firstNode, int nextNode, int distance) {
		this.firstNode=firstNode;
		this.nextNode=nextNode;
		this.distance=distance;
	}
}

class vertex{
	
	public int label;
	public boolean visited;
	
	public vertex(int label) {
		this.label = label;
		visited = false;
	}
	
	public void setVisited() {
		visited = true;
	}
	
	
}

class PQ{
	private int maxSize;
	private int[] queArray;
	private int front;
	private int rear;
	private int nItems;
	
	public PQ(int s){
		maxSize = s;
		queArray = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void insert(int item){
		int j;
		if(nItems==0) // if no items,
			queArray[nItems++] = item; // insert at 0
		else {
			for(j=nItems-1; j>=0; j--){
				if( item > queArray[j] ) // if new item larger,
					queArray[j+1] = queArray[j]; // shift upward
				else // if smaller,
					break; // done shifting
			} // end for
		queArray[j+1] = item; // insert it
		nItems++;
		} // end else (nItems > 0)
	} // end insert()
	
	public int remove() // remove minimum item
	{ return queArray[--nItems]; }
	
	public boolean isEmpty(){
		return (nItems==0);
	}
	
	public int size(){
		if(rear >= front) // contiguous sequence
		return rear-front+1;
		else // broken sequence
		return (maxSize-front) + (rear+1);
	}

	
	public boolean has(int node) {
		for(int i=0; i<maxSize; i++) {
			if(queArray[i] == node) {
				return true;
			}
		}
		
		return false;
	}
	
	
}



class graph{
	private vertex vertexList[]; // list of vertices
	private int adjMat[][]; // adjacency matrix with weight
	private int size; // current number of vertices
	private int nTree; // number of verts in tree
	private int currentVert; // current vertex
	private int startToCurrent; // distance to currentVert
	private int fValue;
	
	public graph(int size) {
		vertexList = new vertex[size+1];
		// adjacency matrix
		adjMat = new int[size + 1][size + 1];
		this.size = size+1;
		nTree = 0;
		for(int j=0; j<size + 1; j++) // set adjacency
			for(int k=0; k<size; k++) // matrix
				adjMat[j][k] = 0;
		
		for(int i=0; i<size + 1; i++) {
			vertexList[i] = new vertex(i);
		}
		
	}
	
	 
	
	public void addEdge(int from, int to, int distance){ 
		adjMat[from][to] = distance;
		adjMat[to][from] = distance;
	} 
	
	
	public LinkedList<Integer> neighboringNodes(int node) {
		
		LinkedList<Integer> adjList = new LinkedList<Integer>();
		
		for(int k=0; k<size; k++) {
			if(adjMat[node][k]!=0) {
				adjList.add(k);
			}
		}
		
		return adjList;
		
		
	}
	
	public int getDistance(int to, int from) {
		return adjMat[to][from];
	}

	
	public void aStar(int goalState, int cVal) {
		
		LinkedList<Integer> path = search(goalState, cVal);
		
		if(path == null) {
			System.out.println("No path exist");
			return;
		}
		
		for(int i=0; i<path.size(); i++) {
			
			System.out.print(path.get(i) + " -> ");

		}
		
		System.out.println("\nTotal f value: " + fValue);
	}
	
	
	public int lowestF(int currentNode, int cVal) {
		
		LinkedList<Integer> childNodes = neighboringNodes(currentNode);
		
		if(childNodes.size() == 1 ) {
			return childNodes.get(0);
		}
		
		int newDistance = 9999999;
		int distance = 0;
		int absoluteLow = 0;
		
		for(int i=0; i<childNodes.size(); i++) {
			
			if(fValue > cVal) {
				return -1;
			}
			
			int childNumber = childNodes.get(i);
			
			if(vertexList[childNumber].visited == false) {
				
				// g value
				distance = getDistance(currentNode, childNumber);
				
				if(newDistance > distance) {
					newDistance = distance;
					vertexList[childNumber].setVisited();
					absoluteLow = childNodes.get(i);
					fValue += newDistance;
					System.out.println("Current path cost: " + fValue);
				}
			}
		}
		
		return absoluteLow;	
	}
	
	
	// A* search
	public LinkedList<Integer> search(int goalState, int cVal){
		
		PQ openSet = new PQ(20);
		LinkedList<Integer> cameFrom = new LinkedList<>();
		
		
		//add starting node to open set
		int currentNode = vertexList[0].label;
		vertexList[currentNode].setVisited();
		openSet.insert(currentNode);
		
		
		//g is movement cost
		//h is estimation cost

		while(!openSet.isEmpty()) {
			
			currentNode = lowestF(currentNode, cVal);
			cameFrom.add(currentNode);
			
			if(currentNode == -1) {
				return null;
			}
			
			if(currentNode == goalState) {
				return cameFrom;
			}
			
			if(!openSet.has(currentNode)) {
				openSet.insert(currentNode);
			}
			
		}

		return null;
	 
	 }

	
}