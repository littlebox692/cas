package org.apereo.cas.configuration.model.support.saml.sps;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This is {@link AbstractSamlSPProperties}.
 *
 * @author Misagh Moayyed
 * @since 5.0.0
 */
public abstract class AbstractSamlSPProperties {
    private String metadata;
    private String name = this.getClass().getSimpleName();
    private String description = this.getClass().getSimpleName().concat(" SAML SP Integration");
    private String nameIdAttribute;
    private String nameIdFormat;
    private List<String> attributes = new ArrayList<>();
    private String signatureLocation;
    private List<String> entityIds = new ArrayList<>();
    private boolean signResponses = true;
    private boolean signAssertions;

    public boolean isSignResponses() {
        return signResponses;
    }

    public void setSignResponses(final boolean signResponses) {
        this.signResponses = signResponses;
    }

    public boolean isSignAssertions() {
        return signAssertions;
    }

    public void setSignAssertions(final boolean signAssertions) {
        this.signAssertions = signAssertions;
    }

    public List<String> getEntityIds() {
        return entityIds;
    }

    public void setEntityIds(final List<String> entityIds) {
        this.entityIds = entityIds;
    }

    public String getNameIdFormat() {
        return nameIdFormat;
    }

    public void setNameIdFormat(final String nameIdFormat) {
        this.nameIdFormat = nameIdFormat;
    }

    public String getSignatureLocation() {
        return signatureLocation;
    }

    public void setSignatureLocation(final String signatureLocation) {
        this.signatureLocation = signatureLocation;
    }

    public List<String> getAttributes() {
        return attributes;
    }

    public void setAttributes(final List<String> attributes) {
        this.attributes = attributes;
    }

    /**
     * Sets attributes.
     *
     * @param attributes the attributes
     */
    public void setAttributes(final String... attributes) {
        setAttributes(Stream.of(attributes).collect(Collectors.toList()));
    }

    public String getNameIdAttribute() {
        return nameIdAttribute;
    }

    public void setNameIdAttribute(final String nameIdAttribute) {
        this.nameIdAttribute = nameIdAttribute;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(final String metadata) {
        this.metadata = metadata;
    }
}
