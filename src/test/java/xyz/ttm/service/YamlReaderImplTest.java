package xyz.ttm.service;

import org.junit.Assert;
import org.junit.Test;

public class YamlReaderImplTest {

    @Test
    public void loadConfig(){
        YamlReader<Pet> yamlReader = new YamlReader<>(Pet.class);
        Pet addresses = yamlReader.loadFile("test.yaml");
        Assert.assertEquals("Lassie", addresses.getName());
    }

    private static class Pet {
        public String name;

        public Pet() {
            super();
        }

        public String getName() {
            return name;
        }
    }

}
