package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.*;

/**
 * Pet
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-27T12:29:55.795Z")

@Entity
public class Pet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("datumpozicania")
    private String datumpozicania = null;

    @JsonProperty("datumvratenia")
    private String datumvratenia = null;

    @JsonProperty("maxdatum")
    private String maxdatum = null;

    @JsonProperty("note")
    private String note = null;

    @ApiModelProperty(example = "doggie", required = true, value = "")

    public String getDatumpozicania() {
        return datumpozicania;
    }

    public void setDatumpozicania(String datumpozicania) {
        this.datumpozicania = datumpozicania;
    }

    @ApiModelProperty(example = "doggie", required = true, value = "")
    public String getDatumvratenia() {
        return datumvratenia;
    }

    public void setDatumvratenia(String datumvratenia) {
        this.datumvratenia = datumvratenia;
    }

    @ApiModelProperty(example = "doggie", required = true, value = "")
    public String getMaxdatum() {
        return maxdatum;
    }

    public void setMaxdatum(String maxdatum) {
        this.maxdatum = maxdatum;
    }

    @ApiModelProperty(example = "doggie", required = true, value = "")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    /*  public Pet id(Long id) {
        this.id = id;
        return this;
    }/*

    /**
     * Get id
     *
     * @return id
     *
     */
    @ApiModelProperty(value = "")

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pet name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     *
     */
    @ApiModelProperty(example = "doggie", required = true, value = "")
    @NotNull

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pet pet = (Pet) o;
        return Objects.equals(this.id, pet.id)
                && Objects.equals(this.name, pet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    /*  @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Pet {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
 /* private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }*/
    public Pet() {
    }

    public Pet(Long i, String name, String datumPozicania, String datumVratenia, String maxdatum, String note) {
        this.id = i;
        this.name = name;
        this.datumpozicania = datumPozicania;
        this.datumvratenia = datumVratenia;
        this.maxdatum = maxdatum;
        this.note = note;
    }
}
