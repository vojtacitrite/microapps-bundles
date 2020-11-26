package com.citrix.microapps.bundlegen.pojo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ScriptMetadata {

    private final String originalFileName;
    private final String storedFileName;
    private final String checksum;
    private final String apiVersion;

    @JsonCreator
    public ScriptMetadata(
            @JsonProperty(value = "originalFileName", required = true) String originalFileName,
            @JsonProperty(value = "storedFileName", required = true) String storedFileName,
            @JsonProperty(value = "checksum", required = true) String checksum,
            @JsonProperty(value = "apiVersion", required = true) String apiVersion) {
        this.originalFileName = originalFileName;
        this.storedFileName = storedFileName;
        this.checksum = checksum;
        this.apiVersion = apiVersion;
    }

    public String getOriginalFileName() {
        return originalFileName;
    }

    public String getStoredFileName() {
        return storedFileName;
    }

    public String getChecksum() {
        return checksum;
    }

    public String getApiVersion() {
        return apiVersion;
    }
}

