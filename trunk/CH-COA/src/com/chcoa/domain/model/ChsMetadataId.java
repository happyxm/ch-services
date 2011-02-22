package com.chcoa.domain.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * ChsMetadataId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class ChsMetadataId  implements java.io.Serializable {


    // Fields    

     private String metaCode;
     private String metaValue;


    // Constructors

    /** default constructor */
    public ChsMetadataId() {
    }

    
    /** full constructor */
    public ChsMetadataId(String metaCode, String metaValue) {
        this.metaCode = metaCode;
        this.metaValue = metaValue;
    }

   
    // Property accessors

    @Column(name="META_CODE", nullable=false, length=20)

    public String getMetaCode() {
        return this.metaCode;
    }
    
    public void setMetaCode(String metaCode) {
        this.metaCode = metaCode;
    }

    @Column(name="META_VALUE", nullable=false, length=20)

    public String getMetaValue() {
        return this.metaValue;
    }
    
    public void setMetaValue(String metaValue) {
        this.metaValue = metaValue;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ChsMetadataId) ) return false;
		 ChsMetadataId castOther = ( ChsMetadataId ) other; 
         
		 return ( (this.getMetaCode()==castOther.getMetaCode()) || ( this.getMetaCode()!=null && castOther.getMetaCode()!=null && this.getMetaCode().equals(castOther.getMetaCode()) ) )
 && ( (this.getMetaValue()==castOther.getMetaValue()) || ( this.getMetaValue()!=null && castOther.getMetaValue()!=null && this.getMetaValue().equals(castOther.getMetaValue()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getMetaCode() == null ? 0 : this.getMetaCode().hashCode() );
         result = 37 * result + ( getMetaValue() == null ? 0 : this.getMetaValue().hashCode() );
         return result;
   }   





}