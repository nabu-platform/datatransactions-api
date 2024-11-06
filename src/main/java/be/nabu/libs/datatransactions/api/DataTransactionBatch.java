/*
* Copyright (C) 2014 Alexander Verbruggen
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU Lesser General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public License
* along with this program. If not, see <https://www.gnu.org/licenses/>.
*/

package be.nabu.libs.datatransactions.api;

import java.io.IOException;
import java.net.URI;

public interface DataTransactionBatch<T> {
	/**
	 * The reason that the provider is an object instead of a string is because the provider implementation itself usually doesn't know its name
	 * Meaning, it starts a transaction but doesn't know how the outside world refers to him
	 * For this reason the data batch itself is usually created with a resolver that can transform it to an id
	 */
	public <P> DataTransactionHandle start(T provider, P properties, URI request) throws IOException;
	public String getId();
}