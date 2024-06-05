package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.getId(), job2.getId(), "Jobs can't have the same IDs");
    }

    @Test
    public void testJobConstructorSetsAllFields() {

        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Product tester", job.getName(), "Name field should be 'Product tester'");
        assertTrue(job.getEmployer() instanceof Employer, "Employer field should be an instance of Employer");
        assertEquals("ACME", job.getEmployer().getValue(), "Employer value should be 'ACME'");
        assertTrue(job.getLocation() instanceof Location, "Location field should be an instance of Location");
        assertEquals("Desert", job.getLocation().getValue(), "Location value should be 'Desert'");
        assertTrue(job.getPositionType() instanceof PositionType, "PositionType field should be an instance of PositionType");
        assertEquals("Quality control", job.getPositionType().getValue(), "PositionType value should be 'Quality control'");
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency, "CoreCompetency field should be an instance of CoreCompetency");
        assertEquals("Persistence", job.getCoreCompetency().getValue(), "CoreCompetency value should be 'Persistence'");
    }

    @Test
    public void testJobsForEquality() {

        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(job1.equals(job2), "Two Job objects with different IDs should not be equal");
    }


}
