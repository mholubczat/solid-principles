package me.mholubczat.solidprinciples.goodPractices.openclosed;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClaimApprovalManagerTest {

    @Test
    public void testProcessClaim() {
        HealthInsuranceConveyor healthInsuranceConveyor = new HealthInsuranceConveyor();
        ClaimApprovalManager claimApprovalManager = new ClaimApprovalManager();
        claimApprovalManager.processClaim(healthInsuranceConveyor);

        VehicleInsuranceConveyor vehicleInsuranceConveyor = new VehicleInsuranceConveyor();
        claimApprovalManager.processClaim(vehicleInsuranceConveyor);
    }
}