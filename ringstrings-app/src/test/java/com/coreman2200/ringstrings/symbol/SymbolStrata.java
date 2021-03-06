package com.coreman2200.ringstrings.symbol;

import com.coreman2200.ringstrings.symbol.astralsymbol.AstralStrata;
import com.coreman2200.ringstrings.symbol.entitysymbol.EntityStrata;
import com.coreman2200.ringstrings.symbol.numbersymbol.NumberStrata;

import java.util.List;
import java.util.Arrays;

/**
 * SymbolStrata
 * Describes generic symbol stratas, as to enable cross-symbol type comparisons of scale..
 *
 * Created by Cory Higginbottom on 5/29/15
 * http://github.com/coreman2200
 *
 * Licensed under the GNU General Public License (GPL), Version 2.0.
 * You may not use this file except in compliance with this License.
 *
 * You may obtain a copy of the GPLv2 License at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 */

public enum SymbolStrata {
    SYMBOL(NumberStrata.BASENUMBER, AstralStrata.ASTRALBODY),
    RELATED_SYMBOLS(NumberStrata.DERIVEDNUMBER,
                    AstralStrata.ASTRALASPECT),
    GROUP(NumberStrata.GROUPEDNUMBERS, AstralStrata.ASTRALGROUP, AstralStrata.ASTRALZODIAC, AstralStrata.ASTRALHOUSE ),
    CHART(NumberStrata.CHARTEDNUMBERS, AstralStrata.ASTRALCHART),
    RELATIONAL_MAP(NumberStrata.RELATIONALNUMBERMAP, AstralStrata.RELATIONALASTRALMAP),
    ENTITY(EntityStrata.TAG, EntityStrata.LIGHT, EntityStrata.RING, EntityStrata.PROFILE, EntityStrata.USER,
            EntityStrata.SOCIAL, EntityStrata.GROUPED, EntityStrata.ALL, EntityStrata.GLOBAL );

    private List<Enum> mStrataTypeList;

    SymbolStrata(Enum... stratas) {
        this.mStrataTypeList = Arrays.asList(stratas);
    }

    public List<Enum> getRelevantSymbolGroup() {
        return mStrataTypeList;
    }

    static public SymbolStrata getSymbolStrataFor(Enum<? extends Enum<?>> stratatype) {
        if (stratatype.getClass().equals(SymbolStrata.class))
            return (SymbolStrata)stratatype;

        for (SymbolStrata strata : SymbolStrata.values()) {
            if (strata.mStrataTypeList.contains(stratatype)) {
                return strata;
            }
        }

        // TODO: assert (false);
        throw new NullPointerException();
     }

}
