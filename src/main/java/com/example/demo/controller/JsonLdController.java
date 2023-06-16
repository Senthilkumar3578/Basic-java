package com.example.demo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.github.jsonldjava.core.JsonLdError;
import com.github.jsonldjava.core.JsonLdOptions;
import com.github.jsonldjava.core.JsonLdProcessor;
import com.github.jsonldjava.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/jsonld")
public class JsonLdController {

    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping(value = "/example", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getJsonLdExample() throws IOException, JsonLdError {
        // Create a JSON-LD document as a Java Map
        Map<String, Object> jsonLdDocument = new HashMap<>();
        jsonLdDocument.put("@context", "https://schema.org/");
        jsonLdDocument.put("@type", "Person");
        jsonLdDocument.put("id", "2");
        jsonLdDocument.put("name", "senthil");

        // Convert the Java Map to JSON-LD
        Object jsonLd = JsonUtils.toPrettyString(jsonLdDocument);

        // Compact the JSON-LD document using a provided context
        Object compactJsonLd = JsonLdProcessor.compact(jsonLd, jsonLd, new JsonLdOptions());

        // Convert the compacted JSON-LD document back to a JSON string
        return compactJsonLd.toString();
    }
}

