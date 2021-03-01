package me.mholubczat.solidprinciples.badPractices.openclosed;

public class ClaimApprovalManager {
    public void processHealthClaim (HealthInsuranceConveyor healthInsuranceConveyor){
        if (healthInsuranceConveyor.isValidClaim()){
            System.out.println("Is valid claim");
        }
    }
    public void processVehicleClaim (VehicleInsuranceConveyor vehicleInsuranceConveyor){
        if (vehicleInsuranceConveyor.isValidClaim()){
            System.out.println("Is valid claim");
        }
    }
}
