package com.coreman2200.ringstrings.symbol.astralsymbol.interfaces;

import com.coreman2200.ringstrings.symbol.IGroupedSymbols;
import com.coreman2200.ringstrings.symbol.IRelatedSymbols;

/**
 * IGroupedAstralSymbols
 * Interface describing basic functionality for all grouped astrological symbol derived types.
 *
 * Created by Cory Higginbottom on 6/6/15
 * http://github.com/coreman2200
 *
 * Licensed under the GNU General Public License (GPL), Version 2.0.
 * You may not use this file except in compliance with this License.
 *
 * You may obtain a copy of the GPLv2 License at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 */

public interface IGroupedAstralSymbols extends IAstralSymbol, IGroupedSymbols {
    void addAstralSymbol(Enum<? extends Enum<?>> name, IAstralSymbol symbol);
    IAstralSymbol getAstralSymbol(Enum<? extends Enum<?>> name);
}