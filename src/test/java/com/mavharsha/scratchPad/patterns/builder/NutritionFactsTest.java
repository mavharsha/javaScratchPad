package com.mavharsha.scratchPad.patterns.builder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NutritionFactsTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testShouldValidateObjectCreationWithDefaultParameters() {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(10, 10).build();
        assertNotNull(nutritionFacts);
    }


    @Test
    public void testShouldValidateObjectCreationWithOptionalParameters() {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(10, 10)
                .calories(24)
                .fat(22).carbohydrate(10).build();
        assertNotNull(nutritionFacts);
    }
}