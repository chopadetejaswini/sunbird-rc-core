package dev.sunbirdrc.registry.util;

import org.apache.tinkerpop.gremlin.structure.Vertex;

public class ShardParentInfo {
    /**
     * The definition
     */
    private String name;
    private String uuid;
    private Vertex vertex;

    String schemaName;

    public ShardParentInfo(String name, Vertex vertex) {
        this.name = name;
        this.vertex = vertex;
    }

    public String getName() {
        return name;
    }

    public void setName(String shardId) {
        this.name = shardId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Vertex getVertex() {
        return vertex;
    }

    public void setVertex(Vertex vertex) {
        this.vertex = vertex;
    }



   public  void setSchemaName(String schemaName){
        this.schemaName=schemaName;
    }


    public String getSchemaName() {
        return schemaName;
    }
}
