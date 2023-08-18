package xyz.ttm.service;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;

public record YamlReader<T>(Class<T> type) {

    public T loadFile(String filename) {
        InputStream yamlInputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream(filename);
        return new Yaml().loadAs(yamlInputStream, this.type);
    }

}
