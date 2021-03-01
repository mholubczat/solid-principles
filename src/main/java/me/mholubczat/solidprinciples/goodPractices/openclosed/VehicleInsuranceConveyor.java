package me.mholubczat.solidprinciples.goodPractices.openclosed;

public class VehicleInsuranceConveyor implements InsuranceConveyor {
    @Override
    public boolean isValidClaim() {
        System.out.println("Validating vehicle claim");
        return false;
    }
}
