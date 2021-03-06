/*
 * This file is part of Prepay Credit for Android
 *
 * Copyright © 2014  Damien O'Reilly
 *
 * Prepay Credit for Android is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * Prepay Credit for Android is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Prepay Credit for Android.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Report bugs or new features at: https://github.com/DamienOReilly/PrepayCredit
 * Contact the author at:          damienreilly@gmail.com
 */

package damo.three.ie.prepayusage;

import java.util.Comparator;

/**
 * Comparator used for grouping {@link damo.three.ie.prepayusage.BasicUsageItem} types.
 *
 * @author Damien O'Reilly
 */
public class BasicUsageItemTypeSorter implements Comparator<BasicUsageItem> {

    @Override
    public int compare(BasicUsageItem lhs, BasicUsageItem rhs) {
        return lhs.getItemName().compareTo(rhs.getItemName());
    }
}
