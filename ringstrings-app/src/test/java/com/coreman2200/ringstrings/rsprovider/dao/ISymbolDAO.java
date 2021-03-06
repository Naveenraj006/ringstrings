package com.coreman2200.ringstrings.rsprovider.dao;

import android.content.ContentProviderOperation;
import android.content.ContentValues;

import com.coreman2200.ringstrings.symbol.entitysymbol.Lights.ILightSymbol;
import com.coreman2200.ringstrings.symbol.symbolinterface.ISymbol;

import java.util.List;

/**
 * ISymbolDAO
 * Interface for symbol daos
 *
 * Created by Cory Higginbottom on 2/22/16
 * http://github.com/coreman2200
 *
 * Licensed under the GNU General Public License (GPL), Version 2.0.
 * You may not use this file except in compliance with this License.
 *
 * You may obtain a copy of the GPLv2 License at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 */

public interface ISymbolDAO {
    ILightSymbol getSymbol();
    ContentValues getContentValues();
    List<ContentProviderOperation> batchCreate();
    void add() throws Exception;
    void delete() throws Exception;

}
