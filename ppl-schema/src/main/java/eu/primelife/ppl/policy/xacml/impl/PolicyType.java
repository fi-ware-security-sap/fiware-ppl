/*******************************************************************************
 * Copyright (c) 2013, SAP AG
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions 
 * are met:
 *  
 *     - Redistributions of source code must retain the above copyright notice,
 *      this list of conditions and the following disclaimer.
 *     - Redistributions in binary form must reproduce the above copyright 
 *      notice, this list of conditions and the following disclaimer in the 
 *      documentation and/or other materials provided with the distribution.
 *     - Neither the name of the SAP AG nor the names of its contributors may
 *      be used to endorse or promote products derived from this software 
 *      without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE 
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF 
 * THE POSSIBILITY OF SUCH DAMAGE.
 ******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v3.0-03/04/2009 09:20 AM(valikov)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.03 at 09:58:45 AM CET 
//


package eu.primelife.ppl.policy.xacml.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.jvnet.hyperjaxb3.item.ItemUtils;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.builder.JAXBEqualsBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBHashCodeBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBToStringBuilder;


/**
 * <p>Java class for PolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}Description" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}PolicyDefaults" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}Target"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}CombinerParameters" minOccurs="0"/>
 *           &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}RuleCombinerParameters" minOccurs="0"/>
 *           &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}VariableDefinition"/>
 *           &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}Rule"/>
 *         &lt;/choice>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}Obligations" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PolicyId" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Version" type="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}VersionType" default="1.0" />
 *       &lt;attribute name="RuleCombiningAlgId" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "Policy")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyType", propOrder = {
    "description",
    "policyDefaults",
    "target",
    "combinerParametersOrRuleCombinerParametersOrVariableDefinition",
    "obligations"
})
@XmlSeeAlso({
    eu.primelife.ppl.policy.impl.PolicyType.class
})
@Entity(name = "eu.primelife.ppl.policy.xacml.impl.PolicyType")
@Table(name = "POLICYTYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class PolicyType implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "PolicyDefaults")
    protected DefaultsType policyDefaults;
    @XmlElement(name = "Target", required = true)
    protected TargetType target;
    @XmlElementRefs({
        @XmlElementRef(name = "CombinerParameters", namespace = "urn:oasis:names:tc:xacml:2.0:policy:schema:os", type = JAXBElement.class),
        @XmlElementRef(name = "RuleCombinerParameters", namespace = "urn:oasis:names:tc:xacml:2.0:policy:schema:os", type = JAXBElement.class),
        @XmlElementRef(name = "Rule", namespace = "urn:oasis:names:tc:xacml:2.0:policy:schema:os", type = JAXBElement.class),
        @XmlElementRef(name = "VariableDefinition", namespace = "urn:oasis:names:tc:xacml:2.0:policy:schema:os", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> combinerParametersOrRuleCombinerParametersOrVariableDefinition;
    @XmlElement(name = "Obligations")
    protected ObligationsType obligations;
    @XmlAttribute(name = "PolicyId", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String policyId;
    @XmlAttribute(name = "Version")
    protected String version;
    @XmlAttribute(name = "RuleCombiningAlgId", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String ruleCombiningAlgId;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    protected transient List<PolicyTypeCombinerParametersOrRuleCombinerParametersOrVariableDefinitionItem> combinerParametersOrRuleCombinerParametersOrVariableDefinitionItems;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DESCRIPTION", length = 255)
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the policyDefaults property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultsType }
     *     
     */
    @ManyToOne(targetEntity = DefaultsType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "POLICYDEFAULTS_POLICYTYPE_HJ_0")
    public DefaultsType getPolicyDefaults() {
        return policyDefaults;
    }

    /**
     * Sets the value of the policyDefaults property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultsType }
     *     
     */
    public void setPolicyDefaults(DefaultsType value) {
        this.policyDefaults = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link TargetType }
     *     
     */
    @ManyToOne(targetEntity = TargetType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TARGET_POLICYTYPE_HJID")
    public TargetType getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetType }
     *     
     */
    public void setTarget(TargetType value) {
        this.target = value;
    }

    /**
     * Gets the value of the combinerParametersOrRuleCombinerParametersOrVariableDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the combinerParametersOrRuleCombinerParametersOrVariableDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCombinerParametersOrRuleCombinerParametersOrVariableDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link eu.primelife.ppl.policy.impl.RuleType }{@code >}
     * {@link JAXBElement }{@code <}{@link CombinerParametersType }{@code >}
     * {@link JAXBElement }{@code <}{@link RuleCombinerParametersType }{@code >}
     * {@link JAXBElement }{@code <}{@link eu.primelife.ppl.policy.xacml.impl.RuleType }{@code >}
     * {@link JAXBElement }{@code <}{@link VariableDefinitionType }{@code >}
     * 
     * 
     */
    @Transient
    public List<JAXBElement<?>> getCombinerParametersOrRuleCombinerParametersOrVariableDefinition() {
        if (combinerParametersOrRuleCombinerParametersOrVariableDefinition == null) {
            combinerParametersOrRuleCombinerParametersOrVariableDefinition = new ArrayList<JAXBElement<?>>();
        }
        return this.combinerParametersOrRuleCombinerParametersOrVariableDefinition;
    }

    /**
     * 
     * 
     */
    public void setCombinerParametersOrRuleCombinerParametersOrVariableDefinition(List<JAXBElement<?>> combinerParametersOrRuleCombinerParametersOrVariableDefinition) {
        this.combinerParametersOrRuleCombinerParametersOrVariableDefinition = combinerParametersOrRuleCombinerParametersOrVariableDefinition;
    }

    /**
     * Gets the value of the obligations property.
     * 
     * @return
     *     possible object is
     *     {@link ObligationsType }
     *     
     */
    @ManyToOne(targetEntity = ObligationsType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "OBLIGATIONS_POLICYTYPE_HJID")
    public ObligationsType getObligations() {
        return obligations;
    }

    /**
     * Sets the value of the obligations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObligationsType }
     *     
     */
    public void setObligations(ObligationsType value) {
        this.obligations = value;
    }

    /**
     * Gets the value of the policyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "POLICYID")
    public String getPolicyId() {
        return policyId;
    }

    /**
     * Sets the value of the policyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyId(String value) {
        this.policyId = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "VERSION_", length = 255)
    public String getVersion() {
        if (version == null) {
            return "1.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the ruleCombiningAlgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "RULECOMBININGALGID")
    public String getRuleCombiningAlgId() {
        return ruleCombiningAlgId;
    }

    /**
     * Sets the value of the ruleCombiningAlgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleCombiningAlgId(String value) {
        this.ruleCombiningAlgId = value;
    }

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

    @OneToMany(targetEntity = PolicyTypeCombinerParametersOrRuleCombinerParametersOrVariableDefinitionItem.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "COMBINERPARAMETERSORRULECOMB_1")
    public List<PolicyTypeCombinerParametersOrRuleCombinerParametersOrVariableDefinitionItem> getCombinerParametersOrRuleCombinerParametersOrVariableDefinitionItems() {
        if (this.combinerParametersOrRuleCombinerParametersOrVariableDefinitionItems == null) {
            this.combinerParametersOrRuleCombinerParametersOrVariableDefinitionItems = new ArrayList<PolicyTypeCombinerParametersOrRuleCombinerParametersOrVariableDefinitionItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.combinerParametersOrRuleCombinerParametersOrVariableDefinition)) {
            this.combinerParametersOrRuleCombinerParametersOrVariableDefinition = ItemUtils.wrap(this.combinerParametersOrRuleCombinerParametersOrVariableDefinition, this.combinerParametersOrRuleCombinerParametersOrVariableDefinitionItems, PolicyTypeCombinerParametersOrRuleCombinerParametersOrVariableDefinitionItem.class);
        }
        return this.combinerParametersOrRuleCombinerParametersOrVariableDefinitionItems;
    }

    public void setCombinerParametersOrRuleCombinerParametersOrVariableDefinitionItems(List<PolicyTypeCombinerParametersOrRuleCombinerParametersOrVariableDefinitionItem> value) {
        this.combinerParametersOrRuleCombinerParametersOrVariableDefinition = null;
        this.combinerParametersOrRuleCombinerParametersOrVariableDefinitionItems = null;
        this.combinerParametersOrRuleCombinerParametersOrVariableDefinitionItems = value;
        if (this.combinerParametersOrRuleCombinerParametersOrVariableDefinitionItems == null) {
            this.combinerParametersOrRuleCombinerParametersOrVariableDefinitionItems = new ArrayList<PolicyTypeCombinerParametersOrRuleCombinerParametersOrVariableDefinitionItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.combinerParametersOrRuleCombinerParametersOrVariableDefinition)) {
            this.combinerParametersOrRuleCombinerParametersOrVariableDefinition = ItemUtils.wrap(this.combinerParametersOrRuleCombinerParametersOrVariableDefinition, this.combinerParametersOrRuleCombinerParametersOrVariableDefinitionItems, PolicyTypeCombinerParametersOrRuleCombinerParametersOrVariableDefinitionItem.class);
        }
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof PolicyType)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        final PolicyType that = ((PolicyType) object);
        equalsBuilder.append(this.getDescription(), that.getDescription());
        equalsBuilder.append(this.getPolicyDefaults(), that.getPolicyDefaults());
        equalsBuilder.append(this.getTarget(), that.getTarget());
        equalsBuilder.append(this.getCombinerParametersOrRuleCombinerParametersOrVariableDefinition(), that.getCombinerParametersOrRuleCombinerParametersOrVariableDefinition());
        equalsBuilder.append(this.getObligations(), that.getObligations());
        equalsBuilder.append(this.getPolicyId(), that.getPolicyId());
        equalsBuilder.append(this.getVersion(), that.getVersion());
        equalsBuilder.append(this.getRuleCombiningAlgId(), that.getRuleCombiningAlgId());
    }

    public boolean equals(Object object) {
        if (!(object instanceof PolicyType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EqualsBuilder equalsBuilder = new JAXBEqualsBuilder();
        equals(object, equalsBuilder);
        return equalsBuilder.isEquals();
    }

    public void hashCode(HashCodeBuilder hashCodeBuilder) {
        hashCodeBuilder.append(this.getDescription());
        hashCodeBuilder.append(this.getPolicyDefaults());
        hashCodeBuilder.append(this.getTarget());
        hashCodeBuilder.append(this.getCombinerParametersOrRuleCombinerParametersOrVariableDefinition());
        hashCodeBuilder.append(this.getObligations());
        hashCodeBuilder.append(this.getPolicyId());
        hashCodeBuilder.append(this.getVersion());
        hashCodeBuilder.append(this.getRuleCombiningAlgId());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public void toString(ToStringBuilder toStringBuilder) {
        {
            String theDescription;
            theDescription = this.getDescription();
            toStringBuilder.append("description", theDescription);
        }
        {
            DefaultsType thePolicyDefaults;
            thePolicyDefaults = this.getPolicyDefaults();
            toStringBuilder.append("policyDefaults", thePolicyDefaults);
        }
        {
            TargetType theTarget;
            theTarget = this.getTarget();
            toStringBuilder.append("target", theTarget);
        }
        {
            List<JAXBElement<?>> theCombinerParametersOrRuleCombinerParametersOrVariableDefinition;
            theCombinerParametersOrRuleCombinerParametersOrVariableDefinition = this.getCombinerParametersOrRuleCombinerParametersOrVariableDefinition();
            toStringBuilder.append("combinerParametersOrRuleCombinerParametersOrVariableDefinition", theCombinerParametersOrRuleCombinerParametersOrVariableDefinition);
        }
        {
            ObligationsType theObligations;
            theObligations = this.getObligations();
            toStringBuilder.append("obligations", theObligations);
        }
        {
            String thePolicyId;
            thePolicyId = this.getPolicyId();
            toStringBuilder.append("policyId", thePolicyId);
        }
        {
            String theVersion;
            theVersion = this.getVersion();
            toStringBuilder.append("version", theVersion);
        }
        {
            String theRuleCombiningAlgId;
            theRuleCombiningAlgId = this.getRuleCombiningAlgId();
            toStringBuilder.append("ruleCombiningAlgId", theRuleCombiningAlgId);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

}
