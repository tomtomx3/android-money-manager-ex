/*******************************************************************************
 * Copyright (C) 2012 The Android Money Manager Ex Project
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 ******************************************************************************/
package com.money.manager.ex.database;

public class TableBudgetTable extends Dataset {
	// FIELDS
	public static final String BUDGETENTRYID = "BUDGETENTRYID";
	public static final String BUDGETYEARID = "BUDGETYEARID";
	public static final String CATEGID = "CATEGID";
	public static final String SUBCATEGID = "SUBCATEGID";
	public static final String PERIOD = "PERIOD";

	// CONSTRUCTOR
	public TableBudgetTable() {
		super("budgettable_v1", DatasetType.TABLE, "budgettable");
	}
	
	@Override
	public String[] getAllColumns() {
		return new String[] {"BUDGETENTRYID AS _id", BUDGETENTRYID, BUDGETYEARID, CATEGID, SUBCATEGID, PERIOD};
	}
}
