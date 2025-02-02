// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/** Matches single or multi-word synonyms in a token stream. This token filter is implemented using Apache Lucene. */
@Fluent
public final class SynonymTokenFilter extends TokenFilter {
    /*
     * Identifies the concrete type of the token filter.
     */
    private static final String ODATA_TYPE = "#Microsoft.Azure.Search.SynonymTokenFilter";

    /*
     * A list of synonyms in following one of two formats: 1. incredible, unbelievable, fabulous => amazing - all terms
     * on the left side of => symbol will be replaced with all terms on its right side; 2. incredible, unbelievable,
     * fabulous, amazing - comma separated list of equivalent words. Set the expand option to change how this list is
     * interpreted.
     */
    private final List<String> synonyms;

    /*
     * A value indicating whether to case-fold input for matching. Default is false.
     */
    private Boolean caseIgnored;

    /*
     * A value indicating whether all words in the list of synonyms (if => notation is not used) will map to one
     * another. If true, all words in the list of synonyms (if => notation is not used) will map to one another. The
     * following list: incredible, unbelievable, fabulous, amazing is equivalent to: incredible, unbelievable,
     * fabulous, amazing => incredible, unbelievable, fabulous, amazing. If false, the following list: incredible,
     * unbelievable, fabulous, amazing will be equivalent to: incredible, unbelievable, fabulous, amazing =>
     * incredible. Default is true.
     */
    private Boolean expand;

    /**
     * Creates an instance of SynonymTokenFilter class.
     *
     * @param name the name value to set.
     * @param synonyms the synonyms value to set.
     */
    public SynonymTokenFilter(String name, List<String> synonyms) {
        super(name);
        this.synonyms = synonyms;
    }

    /**
     * Get the synonyms property: A list of synonyms in following one of two formats: 1. incredible, unbelievable,
     * fabulous =&gt; amazing - all terms on the left side of =&gt; symbol will be replaced with all terms on its right
     * side; 2. incredible, unbelievable, fabulous, amazing - comma separated list of equivalent words. Set the expand
     * option to change how this list is interpreted.
     *
     * @return the synonyms value.
     */
    public List<String> getSynonyms() {
        return this.synonyms;
    }

    /**
     * Get the caseIgnored property: A value indicating whether to case-fold input for matching. Default is false.
     *
     * @return the caseIgnored value.
     */
    public Boolean isCaseIgnored() {
        return this.caseIgnored;
    }

    /**
     * Set the caseIgnored property: A value indicating whether to case-fold input for matching. Default is false.
     *
     * @param caseIgnored the caseIgnored value to set.
     * @return the SynonymTokenFilter object itself.
     */
    public SynonymTokenFilter setCaseIgnored(Boolean caseIgnored) {
        this.caseIgnored = caseIgnored;
        return this;
    }

    /**
     * Get the expand property: A value indicating whether all words in the list of synonyms (if =&gt; notation is not
     * used) will map to one another. If true, all words in the list of synonyms (if =&gt; notation is not used) will
     * map to one another. The following list: incredible, unbelievable, fabulous, amazing is equivalent to: incredible,
     * unbelievable, fabulous, amazing =&gt; incredible, unbelievable, fabulous, amazing. If false, the following list:
     * incredible, unbelievable, fabulous, amazing will be equivalent to: incredible, unbelievable, fabulous, amazing
     * =&gt; incredible. Default is true.
     *
     * @return the expand value.
     */
    public Boolean getExpand() {
        return this.expand;
    }

    /**
     * Set the expand property: A value indicating whether all words in the list of synonyms (if =&gt; notation is not
     * used) will map to one another. If true, all words in the list of synonyms (if =&gt; notation is not used) will
     * map to one another. The following list: incredible, unbelievable, fabulous, amazing is equivalent to: incredible,
     * unbelievable, fabulous, amazing =&gt; incredible, unbelievable, fabulous, amazing. If false, the following list:
     * incredible, unbelievable, fabulous, amazing will be equivalent to: incredible, unbelievable, fabulous, amazing
     * =&gt; incredible. Default is true.
     *
     * @param expand the expand value to set.
     * @return the SynonymTokenFilter object itself.
     */
    public SynonymTokenFilter setExpand(Boolean expand) {
        this.expand = expand;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", ODATA_TYPE);
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeArrayField("synonyms", this.synonyms, (writer, element) -> writer.writeString(element));
        jsonWriter.writeBooleanField("ignoreCase", this.caseIgnored);
        jsonWriter.writeBooleanField("expand", this.expand);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SynonymTokenFilter from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SynonymTokenFilter if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the SynonymTokenFilter.
     */
    public static SynonymTokenFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean nameFound = false;
                    String name = null;
                    boolean synonymsFound = false;
                    List<String> synonyms = null;
                    Boolean caseIgnored = null;
                    Boolean expand = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("@odata.type".equals(fieldName)) {
                            String odataType = reader.getString();
                            if (!ODATA_TYPE.equals(odataType)) {
                                throw new IllegalStateException(
                                        "'@odata.type' was expected to be non-null and equal to '"
                                                + ODATA_TYPE
                                                + "'. The found '@odata.type' was '"
                                                + odataType
                                                + "'.");
                            }
                        } else if ("name".equals(fieldName)) {
                            name = reader.getString();
                            nameFound = true;
                        } else if ("synonyms".equals(fieldName)) {
                            synonyms = reader.readArray(reader1 -> reader1.getString());
                            synonymsFound = true;
                        } else if ("ignoreCase".equals(fieldName)) {
                            caseIgnored = reader.getNullable(JsonReader::getBoolean);
                        } else if ("expand".equals(fieldName)) {
                            expand = reader.getNullable(JsonReader::getBoolean);
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (nameFound && synonymsFound) {
                        SynonymTokenFilter deserializedSynonymTokenFilter = new SynonymTokenFilter(name, synonyms);
                        deserializedSynonymTokenFilter.caseIgnored = caseIgnored;
                        deserializedSynonymTokenFilter.expand = expand;

                        return deserializedSynonymTokenFilter;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!nameFound) {
                        missingProperties.add("name");
                    }
                    if (!synonymsFound) {
                        missingProperties.add("synonyms");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }
}
