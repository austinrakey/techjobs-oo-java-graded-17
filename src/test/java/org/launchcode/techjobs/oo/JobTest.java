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

        assertEquals("Name field should be 'Product tester'", "Product tester", job.getName());
        assertTrue(job.getEmployer() instanceof Employer, "Employer field should be an instance of Employer");
        assertEquals("Employer value should be 'ACME'", "ACME", job.getEmployer().getValue());
        assertTrue(job.getLocation() instanceof Location, "Location field should be an instance of Location");
        assertEquals("Location value should be 'Desert'", "Desert", job.getLocation().getValue());
        assertTrue(job.getPositionType() instanceof PositionType, "PositionType field should be an instance of PositionType");
        assertEquals("PositionType value should be 'Quality control'", "Quality control", job.getPositionType().getValue());
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency, "CoreCompetency field should be an instance of CoreCompetency");
        assertEquals("CoreCompetency value should be 'Persistence'", "Persistence", job.getCoreCompetency().getValue());
    }


    @Test
    public void testJobsForEquality() {

        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(job1.equals(job2), "Two Job objects with different IDs should not be equal");
    }


    @Test
    public void testToStringStartsAndEndsWithNewLine() {
//        Job job = new Job();
        Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String toStringResult = job.toString();
        assertEquals(true, toStringResult.startsWith(System.lineSeparator()));
        assertEquals(true, toStringResult.endsWith(System.lineSeparator()));
    }

//    @Test
//    public void testToStringStartsAndEndsWithNewLine() {
//        Job job = new Job();
//        String toStringResult = job.toString();
//        System.out.println("toStringResult: [" + toStringResult + "]");
//        assertEquals(true, toStringResult.startsWith(System.lineSeparator()));
//        assertEquals(true, toStringResult.endsWith(System.lineSeparator()));
//    }



    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String newLine = System.lineSeparator();
        String expectedOutput = newLine + "ID: " + job.getId() + newLine +
                "Name: Product tester" + newLine +
                "Employer: ACME" + newLine +
                "Location: Desert" + newLine +
                "Position Type: Quality control" + newLine +
                "Core Competency: Persistence" + newLine;
        assertEquals(expectedOutput, job.toString());
    }

//    @Test
//    public void testToStringHandlesEmptyField() {
//        Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
//        String expectedOutput = "\nID: " + job.getId() + "\nName: Data not available\nEmployer: Data not available\nLocation: Data not available\nPosition Type: Data not available\nCore Competency: Data not available\n";
//        assertEquals(expectedOutput, job.toString());
//    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String newLine = System.lineSeparator();
        String expectedOutput = newLine + "ID: " + job.getId() + newLine +
                "Name: Data not available" + newLine +
                "Employer: Data not available" + newLine +
                "Location: Data not available" + newLine +
                "Position Type: Data not available" + newLine +
                "Core Competency: Data not available" + newLine;
        assertEquals(expectedOutput, job.toString());
    }

}
