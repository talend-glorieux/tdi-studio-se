/*
 * XML Type:  OrganizationResources
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.OrganizationResources
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML OrganizationResources(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class OrganizationResourcesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.OrganizationResources
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationResourcesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENTNUMBEROFACTIVEUSERS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "CurrentNumberOfActiveUsers");
    private static final javax.xml.namespace.QName CURRENTNUMBEROFCUSTOMENTITIES$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "CurrentNumberOfCustomEntities");
    private static final javax.xml.namespace.QName CURRENTNUMBEROFNONINTERACTIVEUSERS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "CurrentNumberOfNonInteractiveUsers");
    private static final javax.xml.namespace.QName CURRENTNUMBEROFPUBLISHEDWORKFLOWS$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "CurrentNumberOfPublishedWorkflows");
    private static final javax.xml.namespace.QName CURRENTSTORAGE$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "CurrentStorage");
    private static final javax.xml.namespace.QName MAXNUMBEROFACTIVEUSERS$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "MaxNumberOfActiveUsers");
    private static final javax.xml.namespace.QName MAXNUMBEROFCUSTOMENTITIES$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "MaxNumberOfCustomEntities");
    private static final javax.xml.namespace.QName MAXNUMBEROFNONINTERACTIVEUSERS$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "MaxNumberOfNonInteractiveUsers");
    private static final javax.xml.namespace.QName MAXNUMBEROFPUBLISHEDWORKFLOWS$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "MaxNumberOfPublishedWorkflows");
    private static final javax.xml.namespace.QName MAXSTORAGE$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "MaxStorage");
    
    
    /**
     * Gets the "CurrentNumberOfActiveUsers" element
     */
    public int getCurrentNumberOfActiveUsers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTNUMBEROFACTIVEUSERS$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CurrentNumberOfActiveUsers" element
     */
    public org.apache.xmlbeans.XmlInt xgetCurrentNumberOfActiveUsers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CURRENTNUMBEROFACTIVEUSERS$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "CurrentNumberOfActiveUsers" element
     */
    public boolean isSetCurrentNumberOfActiveUsers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENTNUMBEROFACTIVEUSERS$0) != 0;
        }
    }
    
    /**
     * Sets the "CurrentNumberOfActiveUsers" element
     */
    public void setCurrentNumberOfActiveUsers(int currentNumberOfActiveUsers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTNUMBEROFACTIVEUSERS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENTNUMBEROFACTIVEUSERS$0);
            }
            target.setIntValue(currentNumberOfActiveUsers);
        }
    }
    
    /**
     * Sets (as xml) the "CurrentNumberOfActiveUsers" element
     */
    public void xsetCurrentNumberOfActiveUsers(org.apache.xmlbeans.XmlInt currentNumberOfActiveUsers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CURRENTNUMBEROFACTIVEUSERS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CURRENTNUMBEROFACTIVEUSERS$0);
            }
            target.set(currentNumberOfActiveUsers);
        }
    }
    
    /**
     * Unsets the "CurrentNumberOfActiveUsers" element
     */
    public void unsetCurrentNumberOfActiveUsers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENTNUMBEROFACTIVEUSERS$0, 0);
        }
    }
    
    /**
     * Gets the "CurrentNumberOfCustomEntities" element
     */
    public int getCurrentNumberOfCustomEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTNUMBEROFCUSTOMENTITIES$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CurrentNumberOfCustomEntities" element
     */
    public org.apache.xmlbeans.XmlInt xgetCurrentNumberOfCustomEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CURRENTNUMBEROFCUSTOMENTITIES$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "CurrentNumberOfCustomEntities" element
     */
    public boolean isSetCurrentNumberOfCustomEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENTNUMBEROFCUSTOMENTITIES$2) != 0;
        }
    }
    
    /**
     * Sets the "CurrentNumberOfCustomEntities" element
     */
    public void setCurrentNumberOfCustomEntities(int currentNumberOfCustomEntities)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTNUMBEROFCUSTOMENTITIES$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENTNUMBEROFCUSTOMENTITIES$2);
            }
            target.setIntValue(currentNumberOfCustomEntities);
        }
    }
    
    /**
     * Sets (as xml) the "CurrentNumberOfCustomEntities" element
     */
    public void xsetCurrentNumberOfCustomEntities(org.apache.xmlbeans.XmlInt currentNumberOfCustomEntities)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CURRENTNUMBEROFCUSTOMENTITIES$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CURRENTNUMBEROFCUSTOMENTITIES$2);
            }
            target.set(currentNumberOfCustomEntities);
        }
    }
    
    /**
     * Unsets the "CurrentNumberOfCustomEntities" element
     */
    public void unsetCurrentNumberOfCustomEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENTNUMBEROFCUSTOMENTITIES$2, 0);
        }
    }
    
    /**
     * Gets the "CurrentNumberOfNonInteractiveUsers" element
     */
    public int getCurrentNumberOfNonInteractiveUsers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTNUMBEROFNONINTERACTIVEUSERS$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CurrentNumberOfNonInteractiveUsers" element
     */
    public org.apache.xmlbeans.XmlInt xgetCurrentNumberOfNonInteractiveUsers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CURRENTNUMBEROFNONINTERACTIVEUSERS$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "CurrentNumberOfNonInteractiveUsers" element
     */
    public boolean isSetCurrentNumberOfNonInteractiveUsers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENTNUMBEROFNONINTERACTIVEUSERS$4) != 0;
        }
    }
    
    /**
     * Sets the "CurrentNumberOfNonInteractiveUsers" element
     */
    public void setCurrentNumberOfNonInteractiveUsers(int currentNumberOfNonInteractiveUsers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTNUMBEROFNONINTERACTIVEUSERS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENTNUMBEROFNONINTERACTIVEUSERS$4);
            }
            target.setIntValue(currentNumberOfNonInteractiveUsers);
        }
    }
    
    /**
     * Sets (as xml) the "CurrentNumberOfNonInteractiveUsers" element
     */
    public void xsetCurrentNumberOfNonInteractiveUsers(org.apache.xmlbeans.XmlInt currentNumberOfNonInteractiveUsers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CURRENTNUMBEROFNONINTERACTIVEUSERS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CURRENTNUMBEROFNONINTERACTIVEUSERS$4);
            }
            target.set(currentNumberOfNonInteractiveUsers);
        }
    }
    
    /**
     * Unsets the "CurrentNumberOfNonInteractiveUsers" element
     */
    public void unsetCurrentNumberOfNonInteractiveUsers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENTNUMBEROFNONINTERACTIVEUSERS$4, 0);
        }
    }
    
    /**
     * Gets the "CurrentNumberOfPublishedWorkflows" element
     */
    public int getCurrentNumberOfPublishedWorkflows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTNUMBEROFPUBLISHEDWORKFLOWS$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CurrentNumberOfPublishedWorkflows" element
     */
    public org.apache.xmlbeans.XmlInt xgetCurrentNumberOfPublishedWorkflows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CURRENTNUMBEROFPUBLISHEDWORKFLOWS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "CurrentNumberOfPublishedWorkflows" element
     */
    public boolean isSetCurrentNumberOfPublishedWorkflows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENTNUMBEROFPUBLISHEDWORKFLOWS$6) != 0;
        }
    }
    
    /**
     * Sets the "CurrentNumberOfPublishedWorkflows" element
     */
    public void setCurrentNumberOfPublishedWorkflows(int currentNumberOfPublishedWorkflows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTNUMBEROFPUBLISHEDWORKFLOWS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENTNUMBEROFPUBLISHEDWORKFLOWS$6);
            }
            target.setIntValue(currentNumberOfPublishedWorkflows);
        }
    }
    
    /**
     * Sets (as xml) the "CurrentNumberOfPublishedWorkflows" element
     */
    public void xsetCurrentNumberOfPublishedWorkflows(org.apache.xmlbeans.XmlInt currentNumberOfPublishedWorkflows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CURRENTNUMBEROFPUBLISHEDWORKFLOWS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CURRENTNUMBEROFPUBLISHEDWORKFLOWS$6);
            }
            target.set(currentNumberOfPublishedWorkflows);
        }
    }
    
    /**
     * Unsets the "CurrentNumberOfPublishedWorkflows" element
     */
    public void unsetCurrentNumberOfPublishedWorkflows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENTNUMBEROFPUBLISHEDWORKFLOWS$6, 0);
        }
    }
    
    /**
     * Gets the "CurrentStorage" element
     */
    public int getCurrentStorage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTSTORAGE$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CurrentStorage" element
     */
    public org.apache.xmlbeans.XmlInt xgetCurrentStorage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CURRENTSTORAGE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "CurrentStorage" element
     */
    public boolean isSetCurrentStorage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENTSTORAGE$8) != 0;
        }
    }
    
    /**
     * Sets the "CurrentStorage" element
     */
    public void setCurrentStorage(int currentStorage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTSTORAGE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENTSTORAGE$8);
            }
            target.setIntValue(currentStorage);
        }
    }
    
    /**
     * Sets (as xml) the "CurrentStorage" element
     */
    public void xsetCurrentStorage(org.apache.xmlbeans.XmlInt currentStorage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CURRENTSTORAGE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CURRENTSTORAGE$8);
            }
            target.set(currentStorage);
        }
    }
    
    /**
     * Unsets the "CurrentStorage" element
     */
    public void unsetCurrentStorage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENTSTORAGE$8, 0);
        }
    }
    
    /**
     * Gets the "MaxNumberOfActiveUsers" element
     */
    public int getMaxNumberOfActiveUsers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXNUMBEROFACTIVEUSERS$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxNumberOfActiveUsers" element
     */
    public org.apache.xmlbeans.XmlInt xgetMaxNumberOfActiveUsers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXNUMBEROFACTIVEUSERS$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "MaxNumberOfActiveUsers" element
     */
    public boolean isSetMaxNumberOfActiveUsers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXNUMBEROFACTIVEUSERS$10) != 0;
        }
    }
    
    /**
     * Sets the "MaxNumberOfActiveUsers" element
     */
    public void setMaxNumberOfActiveUsers(int maxNumberOfActiveUsers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXNUMBEROFACTIVEUSERS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXNUMBEROFACTIVEUSERS$10);
            }
            target.setIntValue(maxNumberOfActiveUsers);
        }
    }
    
    /**
     * Sets (as xml) the "MaxNumberOfActiveUsers" element
     */
    public void xsetMaxNumberOfActiveUsers(org.apache.xmlbeans.XmlInt maxNumberOfActiveUsers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXNUMBEROFACTIVEUSERS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MAXNUMBEROFACTIVEUSERS$10);
            }
            target.set(maxNumberOfActiveUsers);
        }
    }
    
    /**
     * Unsets the "MaxNumberOfActiveUsers" element
     */
    public void unsetMaxNumberOfActiveUsers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXNUMBEROFACTIVEUSERS$10, 0);
        }
    }
    
    /**
     * Gets the "MaxNumberOfCustomEntities" element
     */
    public int getMaxNumberOfCustomEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXNUMBEROFCUSTOMENTITIES$12, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxNumberOfCustomEntities" element
     */
    public org.apache.xmlbeans.XmlInt xgetMaxNumberOfCustomEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXNUMBEROFCUSTOMENTITIES$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "MaxNumberOfCustomEntities" element
     */
    public boolean isSetMaxNumberOfCustomEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXNUMBEROFCUSTOMENTITIES$12) != 0;
        }
    }
    
    /**
     * Sets the "MaxNumberOfCustomEntities" element
     */
    public void setMaxNumberOfCustomEntities(int maxNumberOfCustomEntities)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXNUMBEROFCUSTOMENTITIES$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXNUMBEROFCUSTOMENTITIES$12);
            }
            target.setIntValue(maxNumberOfCustomEntities);
        }
    }
    
    /**
     * Sets (as xml) the "MaxNumberOfCustomEntities" element
     */
    public void xsetMaxNumberOfCustomEntities(org.apache.xmlbeans.XmlInt maxNumberOfCustomEntities)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXNUMBEROFCUSTOMENTITIES$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MAXNUMBEROFCUSTOMENTITIES$12);
            }
            target.set(maxNumberOfCustomEntities);
        }
    }
    
    /**
     * Unsets the "MaxNumberOfCustomEntities" element
     */
    public void unsetMaxNumberOfCustomEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXNUMBEROFCUSTOMENTITIES$12, 0);
        }
    }
    
    /**
     * Gets the "MaxNumberOfNonInteractiveUsers" element
     */
    public int getMaxNumberOfNonInteractiveUsers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXNUMBEROFNONINTERACTIVEUSERS$14, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxNumberOfNonInteractiveUsers" element
     */
    public org.apache.xmlbeans.XmlInt xgetMaxNumberOfNonInteractiveUsers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXNUMBEROFNONINTERACTIVEUSERS$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "MaxNumberOfNonInteractiveUsers" element
     */
    public boolean isSetMaxNumberOfNonInteractiveUsers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXNUMBEROFNONINTERACTIVEUSERS$14) != 0;
        }
    }
    
    /**
     * Sets the "MaxNumberOfNonInteractiveUsers" element
     */
    public void setMaxNumberOfNonInteractiveUsers(int maxNumberOfNonInteractiveUsers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXNUMBEROFNONINTERACTIVEUSERS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXNUMBEROFNONINTERACTIVEUSERS$14);
            }
            target.setIntValue(maxNumberOfNonInteractiveUsers);
        }
    }
    
    /**
     * Sets (as xml) the "MaxNumberOfNonInteractiveUsers" element
     */
    public void xsetMaxNumberOfNonInteractiveUsers(org.apache.xmlbeans.XmlInt maxNumberOfNonInteractiveUsers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXNUMBEROFNONINTERACTIVEUSERS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MAXNUMBEROFNONINTERACTIVEUSERS$14);
            }
            target.set(maxNumberOfNonInteractiveUsers);
        }
    }
    
    /**
     * Unsets the "MaxNumberOfNonInteractiveUsers" element
     */
    public void unsetMaxNumberOfNonInteractiveUsers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXNUMBEROFNONINTERACTIVEUSERS$14, 0);
        }
    }
    
    /**
     * Gets the "MaxNumberOfPublishedWorkflows" element
     */
    public int getMaxNumberOfPublishedWorkflows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXNUMBEROFPUBLISHEDWORKFLOWS$16, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxNumberOfPublishedWorkflows" element
     */
    public org.apache.xmlbeans.XmlInt xgetMaxNumberOfPublishedWorkflows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXNUMBEROFPUBLISHEDWORKFLOWS$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "MaxNumberOfPublishedWorkflows" element
     */
    public boolean isSetMaxNumberOfPublishedWorkflows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXNUMBEROFPUBLISHEDWORKFLOWS$16) != 0;
        }
    }
    
    /**
     * Sets the "MaxNumberOfPublishedWorkflows" element
     */
    public void setMaxNumberOfPublishedWorkflows(int maxNumberOfPublishedWorkflows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXNUMBEROFPUBLISHEDWORKFLOWS$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXNUMBEROFPUBLISHEDWORKFLOWS$16);
            }
            target.setIntValue(maxNumberOfPublishedWorkflows);
        }
    }
    
    /**
     * Sets (as xml) the "MaxNumberOfPublishedWorkflows" element
     */
    public void xsetMaxNumberOfPublishedWorkflows(org.apache.xmlbeans.XmlInt maxNumberOfPublishedWorkflows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXNUMBEROFPUBLISHEDWORKFLOWS$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MAXNUMBEROFPUBLISHEDWORKFLOWS$16);
            }
            target.set(maxNumberOfPublishedWorkflows);
        }
    }
    
    /**
     * Unsets the "MaxNumberOfPublishedWorkflows" element
     */
    public void unsetMaxNumberOfPublishedWorkflows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXNUMBEROFPUBLISHEDWORKFLOWS$16, 0);
        }
    }
    
    /**
     * Gets the "MaxStorage" element
     */
    public int getMaxStorage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXSTORAGE$18, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxStorage" element
     */
    public org.apache.xmlbeans.XmlInt xgetMaxStorage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXSTORAGE$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "MaxStorage" element
     */
    public boolean isSetMaxStorage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXSTORAGE$18) != 0;
        }
    }
    
    /**
     * Sets the "MaxStorage" element
     */
    public void setMaxStorage(int maxStorage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXSTORAGE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXSTORAGE$18);
            }
            target.setIntValue(maxStorage);
        }
    }
    
    /**
     * Sets (as xml) the "MaxStorage" element
     */
    public void xsetMaxStorage(org.apache.xmlbeans.XmlInt maxStorage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXSTORAGE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MAXSTORAGE$18);
            }
            target.set(maxStorage);
        }
    }
    
    /**
     * Unsets the "MaxStorage" element
     */
    public void unsetMaxStorage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXSTORAGE$18, 0);
        }
    }
}
