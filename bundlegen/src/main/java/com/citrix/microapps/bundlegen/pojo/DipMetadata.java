package com.citrix.microapps.bundlegen.pojo;

import java.net.URI;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metadata loaded from `metadata.json` for DIP integrations.
 */
public class DipMetadata extends Metadata {
    private final String id;  // TODO: Remove it from source json?
    private final String version;  // TODO: Remove it from source json?

    @JsonCreator
    public DipMetadata(
            @JsonProperty(value = "type", required = true) Type type,
            @JsonProperty(value = "vendor", required = true) String vendor,
            @JsonProperty(value = "id", required = true) String id,
            @JsonProperty(value = "version", required = true) String version,
            @JsonProperty(value = "title", required = true) String title,
            @JsonProperty(value = "description") String description,
            @JsonProperty(value = "iconUrl", required = true) URI iconUrl,
            @JsonProperty(value = "masVersion", required = true) String masVersion,
            @JsonProperty(value = "categories", required = true) List<Category> categories,
            @JsonProperty(value = "created", required = true) String created,
            @JsonProperty(value = "supportsOAuthForActions") boolean supportsOAuthForActions,
            @JsonProperty(value = "i18nLanguages") List<String> i18nLanguages,
            @JsonProperty(value = "apps") List<App> apps,
            @JsonProperty(value = "vaResolvers") List<VaResolver> vaResolvers,
            @JsonProperty(value = "tags") List<Tag> tags
    ) {
        super(type,
                vendor,
                title,
                description,
                iconUrl,
                masVersion,
                categories,
                created,
                supportsOAuthForActions,
                i18nLanguages,
                apps,
                vaResolvers,
                tags,
                null);

        this.id = id;
        this.version = version;
    }

    public String getId() {
        return id;
    }

    public String getVersion() {
        return version;
    }
}
