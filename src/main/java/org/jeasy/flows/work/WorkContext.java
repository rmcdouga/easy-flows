package org.jeasy.flows.work;

import java.util.Map;
import java.util.Set;

/**
 * Work execution context. This can be used to pass initial parameters to the
 * workflow and share data between work units.
 * 
 * <strong>Work context instances are thread-safe.</strong>
 * 
 * @author Mahmoud Ben Hassine (mahmoud.benhassine@icloud.com)
 */
public interface WorkContext {

	void put(String key, Object value);

	Object get(String key);

	Set<Map.Entry<String, Object>> getEntrySet();

	String toString();

}