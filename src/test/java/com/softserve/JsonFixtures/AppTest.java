package com.softserve.JsonFixtures;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.softserve.JsonFixtures.entity.Car;

import ie.corballis.fixtures.annotation.Fixture;
import ie.corballis.fixtures.annotation.FixtureAnnotations;
import ie.corballis.fixtures.io.scanner.FolderFixtureScanner;
import ie.corballis.fixtures.io.scanner.TestFileNameFixtureScanner;
import ie.corballis.fixtures.settings.Settings;

public class AppTest {
    
    @Fixture("cars")
    private List<Car> cars;
    

    @BeforeClass
    public void init() throws Exception {
        FixtureAnnotations.initFixtures(this, new Settings.Builder().useCompositeFixtureScanner(
                new FolderFixtureScanner("src/test/resources/testdata/fixtures"), new TestFileNameFixtureScanner(getClass())));

    }

    @Test
    public void shouldAnswerWithTrue() {
        
        System.out.println(cars.size());
        assertTrue(true);
    }
}
