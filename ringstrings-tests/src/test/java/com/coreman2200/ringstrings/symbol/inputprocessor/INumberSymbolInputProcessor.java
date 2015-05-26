package com.coreman2200.ringstrings.symbol.inputprocessor;

import com.coreman2200.ringstrings.symbol.numbersymbol.INumberSymbol;

/**
 * INumberSymbolInputProcessor
 * Interface for number symbol input processors
 *
 * Created by Cory Higginbottom on 5/25/15
 * http://github.com/coreman2200
 *
 * Licensed under the GNU General Public License (GPL), Version 2.0.
 * You may not use this file except in compliance with this License.
 *
 * You may obtain a copy of the GPLv2 License at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 */

public interface INumberSymbolInputProcessor {
    public INumberSymbol convertTextStringToNumberSymbol(String text);
    public int singularizeValue(int value);
    public int addDigitsOfValue(int value);
    public INumberSymbol convertValueToNumberSymbol(int value);
}
