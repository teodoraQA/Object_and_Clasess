package VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Vehicle> vehicles = new ArrayList<>();
        int countVehicles = 0;

        while (!input.equals("End") && countVehicles <= 50) {
            Vehicle vehicle = getVehicle(input);
            vehicles.add(vehicle);
            countVehicles++;
            input = scanner.nextLine();
        }

        String inputVehicle = scanner.nextLine();

        while (!inputVehicle.equals("Close the Catalogue")) {
            String modelOfVehicle = inputVehicle;
            vehicles.stream()
                    .filter(v -> v.getModel().equals(modelOfVehicle))
                    .collect(Collectors.toList())
                    .forEach(System.out::println);
            inputVehicle = scanner.nextLine();
        }

        double hpCarsAvg = getAvg(vehicles, "Car");
        double hpTrucksAvg = getAvg(vehicles, "Truck");
        System.out.println(String.format("Cars have average horsepower of: %.2f.", hpCarsAvg));
        System.out.println(String.format("Trucks have average horsepower of: %.2f.", hpTrucksAvg));

    }

    private static double getAvg(List<Vehicle> vehicles, String type) {
        double avgHP = 0.0;
        int counterVehicles = 0;
        for (Vehicle v : vehicles) {
            if (v.getType().equals(type)) {
                avgHP += v.getHorsePower();
                counterVehicles++;
            }
        }
        if(counterVehicles == 0){
            return 0;
        }
        return avgHP / counterVehicles;
    }

    public static Vehicle getVehicle(String input) {
        String[] inputVehicle = input.split("\\s+");
        String type = inputVehicle[0];
        if (type.equals("car")) {
            type = "Car";
        } else {
            type = "Truck";
        }
        String model = inputVehicle[1];
        String color = inputVehicle[2];
        int hp = Integer.parseInt(inputVehicle[3]);
        Vehicle newVehicle = new Vehicle(type, model, color, hp);
        return newVehicle;
    }
}