package stacksandqueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class SunsetView {

	class BuildingWithHeight {
		int id;
		int height;

		public BuildingWithHeight(int id, int height) {
			this.id = id;
			this.height = height;
		}
	}

	public List<BuildingWithHeight> buildingWithSunsetViews(List<Integer> buildings) {

		Deque<BuildingWithHeight> buildingsWithSunsetViews = new ArrayDeque<BuildingWithHeight>();
		int buildingIndex = 0;

		Iterator<Integer> iter = buildings.iterator();
		while (iter.hasNext()) {
			Integer building = iter.next();
			while (!buildingsWithSunsetViews.isEmpty() && buildingsWithSunsetViews.peek().height < building.intValue() ) {
				buildingsWithSunsetViews.pop();
			}
			buildingsWithSunsetViews.push(new BuildingWithHeight(buildingIndex, building));
			buildingIndex++;
		}
		return buildingsWithSunsetViews.stream().collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		SunsetView ssView = new SunsetView();
		List<Integer> buildings = Arrays.asList(6, 10, 9, 8, 5, 7, 6, 3, 2, 1);
		List<BuildingWithHeight> buildingsWithSunSetViews = ssView.buildingWithSunsetViews(buildings);
		buildingsWithSunSetViews.forEach(building -> System.out.println("Building id: " + building.id + " Building height: " + building.height));
	}

}
