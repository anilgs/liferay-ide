/*******************************************************************************
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *   
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *   
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *    
 * Contributors:
 *               Kamesh Sampath - initial implementation
 *******************************************************************************/
/**
 * 
 */

package com.liferay.ide.portlet.core.model.lfrportlet.common;

import org.eclipse.sapphire.modeling.IModelElement;
import org.eclipse.sapphire.modeling.ListProperty;
import org.eclipse.sapphire.modeling.ModelElementList;
import org.eclipse.sapphire.modeling.ModelElementType;
import org.eclipse.sapphire.modeling.annotations.GenerateImpl;
import org.eclipse.sapphire.modeling.annotations.Label;
import org.eclipse.sapphire.modeling.annotations.Type;
import org.eclipse.sapphire.modeling.xml.annotations.XmlListBinding;


/**
 * @author kamesh
 */
@GenerateImpl
public interface ILiferayPortletAppBase extends IModelElement {

	ModelElementType TYPE = new ModelElementType( ILiferayPortletAppBase.class );


	// *** RoleMappers ***

	@Type( base = IRoleMapper.class )
	@Label( standard = "Role Mappers" )
	@XmlListBinding( mappings = { @XmlListBinding.Mapping( element = "role-mapper", type = IRoleMapper.class ) } )
	ListProperty PROP_ROLE_MAPPERS = new ListProperty( TYPE, "RoleMappers" );

	ModelElementList<IRoleMapper> getRoleMappers();

	// *** CustomUserAttributes ***

	@Type( base = ICustomUserAttribute.class )
	@Label( standard = "Custom User Attribute" )
	@XmlListBinding( mappings = { @XmlListBinding.Mapping( element = "custom-user-attribute", type = ICustomUserAttribute.class ) } )
	ListProperty PROP_CUSTOM_USER_ATTRIBUTES = new ListProperty( TYPE, "CustomUserAttributes" );

	ModelElementList<ICustomUserAttribute> getCustomUserAttributes();

}
