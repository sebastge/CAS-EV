package citySim.environment.electric;

import repast.simphony.space.continuous.ContinuousSpace;
import repast.simphony.space.graph.Network;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridPoint;

public class DemandLabel extends ElectricEntity{

	private ElectricEntity parent;
	private ContinuousSpace<Object> space;
	private Grid<Object> grid;
	
	public DemandLabel(ContinuousSpace<Object> space, Grid<Object> grid) {
		super(space, grid);
		totalOccupants = 0;
		this.grid = grid;
		this.space = space;

	}
	
}